package racinggame;

import nextstep.utils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;
    private final String carName = "hans";

    @BeforeEach
    void setUpCar() {
        car = new Car(carName);
    }

    @Test
    @DisplayName("자동차 이름 체크")
    void 자동차_이름_체크() {
        assertThat(car.getCarName()).isEqualTo(carName);
    }

    @Test
    @DisplayName("자동차 이동 테스트")
    void 자동차_이동_테스트() {
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
        car.move();
        assertThat(car.getPosition()).isEqualTo(2);
        car.move();
        assertThat(car.getPosition()).isEqualTo(3);
    }

    @Test
    @DisplayName("입력값이 4이상이면 전진 3이하이면 멈춤")
    void 자동차_전진_여부에_따라_이동값_변경() {
        car.tryMove(4);
        assertThat(car.getPosition()).isEqualTo(1);

        car.tryMove(2);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
