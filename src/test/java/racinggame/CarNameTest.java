package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNameTest {

    @Test
    @DisplayName("자동차 이름 5글자 초과일때 테스트")
    void 자동차_이름_5글자_초과시() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car("5글자초과차")).withMessage("차 이름은 5글자 이하여야 합니다.");
    }

    @Test
    @DisplayName("자동차 이름 5글자 이하일때 테스트")
    void 자동차_이름_5글자_이하() {
        CarName carName = new CarName("자동차닷");
        assertThat("자동차닷").isEqualTo(carName.getName());
    }
}
