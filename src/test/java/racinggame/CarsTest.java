package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차 리스트 생성 테스트")
    void 자동차_리스트_생성() {
        String[] carNames = {"hanca", "boa", "nob"};
        Cars cars = new Cars(carNames, new Turn(5));
        for (int i=0; i<carNames.length; i++) {
            assertThat(cars.getCars().get(i).getCarName()).isEqualTo(carNames[i]);
        }
    }


    @Test
    @DisplayName("우승자 확인 테스트")
    void 우승을_누가_했는지_테스트() {
        String[] carNames = {"car1", "car2", "car3"};
        Cars cars = new Cars(carNames, new Turn(5));

        cars.getCars().get(0).move(Movement.GO);
        cars.getCars().get(0).move(Movement.GO);
        cars.getCars().get(1).move(Movement.STOP);
        cars.getCars().get(2).move(Movement.GO);
        cars.getCars().get(2).move(Movement.GO);

        cars.winnerCars();
        assertThat(cars.getWinnerCars()).contains(cars.getCars().get(0), cars.getCars().get(2));
    }

    @Test
    @DisplayName("가장 많이 전진한 자동차의 포지션 체크")
    void 가장_많이_전진한_자동차의_포지션_체크() {
        String[] carNames = {"car1", "car2", "car3"};
        Cars cars = new Cars(carNames, new Turn(5));

        cars.getCars().get(0).move(Movement.GO);
        cars.getCars().get(0).move(Movement.GO);
        cars.getCars().get(2).move(Movement.STOP);

        assertThat(cars.getWinnerPosition()).isEqualTo(2);
    }
}
