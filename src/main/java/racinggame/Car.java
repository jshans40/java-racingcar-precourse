package racinggame;

public class Car {
    private CarName carName;
    private int position;
    private final int MOVE_CONDITION = 3;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public void tryMove(int number) {
        if (number > MOVE_CONDITION) {
            move(Movement.GO);
        }
    }

    public void move(Movement movement) {
        position += movement.move();
    }

    public String getCarName() {
        return carName.getName();
    }


    public int getPosition() {
        return this.position;
    }
}
