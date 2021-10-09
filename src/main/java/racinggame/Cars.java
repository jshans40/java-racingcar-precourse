package racinggame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;
    private final Turn turn;
    private List<Car> winnerCars = new ArrayList<>();

    public Cars(String[] carNames, Turn turn) {
        this.cars = createCars(carNames);
        this.turn = turn;
    }

    private List<Car> createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }


    public List<Car> getCars() {
        return cars;
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
}
