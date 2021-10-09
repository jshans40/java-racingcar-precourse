package racinggame;

import racinggame.controller.RacingController;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        RacingController racingController = new RacingController();
        racingController.play();
    }
}
