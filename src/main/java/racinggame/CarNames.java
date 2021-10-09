package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
    private final int MINIMUM_CAR_NAMES = 2;
    private List<CarName> carNames;

    public CarNames(String carNamesString) {
        String[] carNameArray = carNamesString.split(",");
        if (carNameArray.length < MINIMUM_CAR_NAMES) {
            throw new IllegalArgumentException("자동차 이름은 2개 이상 필요합니다.");
        }

        createCarNames(carNameArray);
    }

    public void createCarNames(String[] carNameArray) {
        carNames = new ArrayList<>();

        for (String carName : carNameArray) {
            carNames.add(new CarName(carName));
        }
    }

    public List<CarName> getCarNames() {
        return carNames;
    }
}
