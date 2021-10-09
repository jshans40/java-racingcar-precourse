package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.model.Car;
import racinggame.model.CarName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"sanghyuk", "test123", "testokkkod", "baedalminjokkorea", "maxmimumstringstestopoeewsxcxaqwed"})
    @DisplayName("자동차 이름 5글자 초과일때 테스트")
    void 자동차_이름_5글자_초과시(String inputs) {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car(new CarName(inputs))).withMessage("차 이름은 5글자 이하여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"p", "has", "mins", "tobis"})
    @DisplayName("자동차 이름 5글자 이하일때 테스트")
    void 자동차_이름_5글자_이하(String inputs) {
        CarName carName = new CarName(inputs);
        assertThat(inputs).isEqualTo(carName.getName());
    }
}
