package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;
import racinggame.model.CarName;
import racinggame.model.Movement;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;
    private CarName carName;

    @BeforeEach
    void setUpCar() {
        carName = new CarName("hans");
        car = new Car(carName);
    }

    @Test
    @DisplayName("자동차 이름 체크")
    void 자동차_이름_체크() {
        assertThat(car.getCarName()).isEqualTo(carName.getName());
    }

    @Test
    @DisplayName("자동차 이동 테스트")
    void 자동차_이동_테스트() {
        car.move(Movement.GoOrStop(5));
        assertThat(car.getPosition()).isEqualTo(1);
        car.move(Movement.GoOrStop(6));
        assertThat(car.getPosition()).isEqualTo(2);
        car.move(Movement.GoOrStop(7));
        assertThat(car.getPosition()).isEqualTo(3);
        car.move(Movement.GoOrStop(3));
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
