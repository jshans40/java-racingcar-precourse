package racinggame.view;

import racinggame.model.Car;
import racinggame.model.Cars;

public class OutputView {
    private final String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String CAR_TURN_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";
    private final String GAME_ERROR_MESSAGE = "[ERROR] ";
    private final String RACE_RESULT = "실행 결과";
    private final String LINE_BREAK = "\n";

    public void printInputNames() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
    }

    public void printInputTurn() {
        System.out.println(CAR_TURN_INPUT_MESSAGE);
    }

    public void printError(String message) {
        System.out.println(GAME_ERROR_MESSAGE + message);
    }

    public void printRaceResult(Cars cars) {
        System.out.println(LINE_BREAK + RACE_RESULT);
        for (int i=0; i<cars.getTurn().getTurn(); i++) {
            printEachCarResult(cars);
            System.out.print(LINE_BREAK);
        }
    }

    private void printEachCarResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getCarName() + " : " + printCarPosition(car.getPosition()));
        }
    }

    private String printCarPosition(int position) {
        StringBuilder carPositionBuilder = new StringBuilder();
        for (int i=0; i<position; i++) {
            carPositionBuilder.append("-");
        }

        return carPositionBuilder.toString();
    }

    public void printWinner(Cars cars) {
        StringBuilder winnerStringBuilder = new StringBuilder();
        for (Car car : cars.getWinnerCars()) {
            winnerStringBuilder.append(car.getCarName()).append(",");
        }
        winnerStringBuilder.deleteCharAt(winnerStringBuilder.length() - 1);
        System.out.printf("최종 우승자는 %s 입니다.", winnerStringBuilder.toString());
    }
}
