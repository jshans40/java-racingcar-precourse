package racinggame.model;

public class Car {
    private CarName carName;
    private int position;

    public Car(CarName carName) {
        this.carName = carName;
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

    public boolean isWinner(int winnerPosition) {
        return position == winnerPosition;
    }
}
