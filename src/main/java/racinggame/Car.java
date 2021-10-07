package racinggame;

public class Car {
    private String carName;
    private int position;
    private final int MOVE_CONDITION = 3;

    public Car(String carName) {
        this.carName = carName;
    }

    public void tryMove(int number) {
        if (number > MOVE_CONDITION) {
            move();
        }
    }

    public void move() {
        position += 1;
    }

    public String getCarName() {
        return carName;
    }


    public int getPosition() {
        return this.position;
    }
}
