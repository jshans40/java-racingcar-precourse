package racinggame.controller;

import racinggame.model.Turn;
import racinggame.model.CarNames;
import racinggame.model.Cars;
import racinggame.view.InputView;
import racinggame.view.OutputView;

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
        try {
            return new CarNames(inputView.carNamesInput());
        } catch (IllegalArgumentException argumentException) {
            outputView.printError(argumentException.getMessage());
            return createCarNames();
        }
    }

    private Turn inputTurn() {
        outputView.printInputTurn();
        return createTurn();
    }

    private Turn createTurn() {
        try {
            return new Turn(inputView.carTurnInput());
        } catch (NumberFormatException e) {
            outputView.printError("숫자만 입력 가능합니다.");
            return createTurn();
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
            return createTurn();
        }
    }
}
