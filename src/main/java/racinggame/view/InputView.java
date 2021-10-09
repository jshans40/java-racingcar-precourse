package racinggame.view;

import nextstep.utils.Console;

public class InputView {
    public String carNamesInput() {
        return Console.readLine();
    }

    public int carTurnInput() {
        return Integer.parseInt(Console.readLine());
    }
}
