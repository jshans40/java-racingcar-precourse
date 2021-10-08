package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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

}
