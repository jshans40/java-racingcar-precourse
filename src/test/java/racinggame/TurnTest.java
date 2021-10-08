package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class TurnTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -5})
    @DisplayName("0이하일때 에러 발생")
    void 숫자_0이하일떄_에러_발생_테스트(int number) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Turn(number)).withMessage("횟수는 1이상의 숫자여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 100, 300})
    @DisplayName("1이상일떄 성공 테스트")
    void 숫자_1이상일떄_성공(int number) {
        Turn turn = new Turn(number);
        assertThat(turn.getTurn()).isEqualTo(number);
    }
}
