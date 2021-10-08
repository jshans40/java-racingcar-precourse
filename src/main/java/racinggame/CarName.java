package racinggame;

public class CarName {
    private final int MIN_CAR_NAME_LENGTH = 1;
    private final int MAX_CAR_NAME_LENGTH = 2;

    private String name;

    public CarName(String carName) {
        if (carName.length() < 1 || carName.length() > 5) {
            throw new IllegalArgumentException("차 이름은 5글자 이하여야 합니다.");
        }

        this.name = carName;
    }

    public String getName() {
        return name;
    }
}
