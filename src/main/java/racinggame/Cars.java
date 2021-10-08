package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carNames) {
        this.cars = createCars(carNames);
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
}
