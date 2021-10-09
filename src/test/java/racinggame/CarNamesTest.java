package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNamesTest {
    @ParameterizedTest
    @DisplayName("자동차 이름을 한대 이하로 입력했을때 에러 발생")
    @ValueSource(strings = {"a", "b", "c"})
    void 자동차_이름_입력(String carName) {
        assertThatIllegalArgumentException().isThrownBy(() -> new CarNames(carName)).withMessage("자동차 이름은 2개 이상 필요합니다.");
    }
}
