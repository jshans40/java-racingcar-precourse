package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] inputCarNames) {
        this.cars = mapCar(inputCarNames);
    }

    private List<Car> mapCar(String[] inputCarNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : inputCarNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
