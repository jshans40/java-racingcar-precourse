package racinggame.model;

import utils.NumberGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private final List<Car> cars;
    private final Turn turn;
    private final NumberGenerator numberGenerator;
    private List<Car> winnerCars = new ArrayList<>();

    public Cars(CarNames carNames, Turn turn) {
        this.cars = createCars(carNames);
        this.turn = turn;
        this.numberGenerator = new NumberGenerator();
    }

    private List<Car> createCars(CarNames carNames) {
        List<Car> cars = new ArrayList<>();

        for (CarName carName : carNames.getCarNames()) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public void race() {
        for (int i=0; i<turn.getTurn(); i++) {
            eachCarMove();
        }
        winnerCars();
    }

    public void eachCarMove() {
        for (Car car : cars) {
            car.move(Movement.GoOrStop(numberGenerator.generateRandomNumberRangeZeroToNine()));
        }
    }

    public void winnerCars() {
        final int winnerPosition = getWinnerPosition();
        for (Car car : cars) {
            addWinnerCars(car, winnerPosition);
        }
    }

    private void addWinnerCars(Car car, int winnerPosition) {
        if (car.isWinner(winnerPosition)) {
            winnerCars.add(car);
        }
    }

    public int getWinnerPosition() {
        List<Car> cars = new ArrayList<>(this.cars);
        cars.sort(Comparator.comparingInt(Car::getPosition).reversed());
        return cars.get(0).getPosition();
    }

    public List<Car> getWinnerCars() {
        return winnerCars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Turn getTurn() {
        return turn;
    }
}
