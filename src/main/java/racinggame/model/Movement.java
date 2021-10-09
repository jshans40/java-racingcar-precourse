package racinggame.model;

public enum Movement {
    GO(1),
    STOP(0);

    private final int move;
    private static final int GO_CONDITION = 3;

    Movement(int move) {
        this.move = move;
    }

    public int move() {
        return move;
    }

    public static Movement GoOrStop(int number) {
        if (number > GO_CONDITION) {
            return GO;
        }

        return STOP;
    }
}
