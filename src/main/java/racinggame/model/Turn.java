package racinggame.model;

public class Turn {
    private final int MINIMUM_TURN_COUNT = 1;
    private final int MINIMUM_USE_TURN_COUNT = 1;
    private int turn;

    public Turn(int turn) {
        if (turn < MINIMUM_TURN_COUNT) {
            throw new IllegalArgumentException("횟수는 1이상의 숫자여야 합니다.");
        }

        this.turn = turn;
    }

    public void useTurn() {
        if (turn < MINIMUM_USE_TURN_COUNT) {
            throw new RuntimeException("횟수가 1보다 작기 때문에 턴을 사용할 수 없습니다.");
        }

        turn -= 1;
    }

    public int getTurn() {
        return turn;
    }
}
