package racinggame;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void play() {
        CarNames carNames = inputCarNames();
        Turn turn = inputTurn();
        Cars cars = new Cars(carNames, turn);
        cars.race();
        outputView.printRaceResult(cars);
        outputView.printWinner(cars);
    }

    private CarNames inputCarNames() {
        outputView.printInputNames();
        return createCarNames();
    }

    private CarNames createCarNames() {
        CarNames carNames = null;
        try {
            carNames = new CarNames(inputView.carNamesInput());
        } catch (IllegalArgumentException argumentException) {
            outputView.printError(argumentException.getMessage());
            createCarNames();
        }

        return carNames;
    }

    private Turn inputTurn() {
        outputView.printInputTurn();
        return createTurn();
    }

    private Turn createTurn() {
        Turn turn = null;
        try {
            turn = new Turn(inputView.carTurnInput());
        } catch (NumberFormatException e) {
            outputView.printError("숫자만 입력 가능합니다.");
            createTurn();
        }

        return turn;
    }
}
