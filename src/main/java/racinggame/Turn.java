package racinggame;

public class Turn {
    private final int turn;

    public Turn(int turn) {
        if (turn < 0) {
            throw new IllegalArgumentException("횟수는 1이상의 숫자여야 합니다.");
        }

        this.turn = turn;
    }

    public int getTurn() {
        return turn;
    }
}
