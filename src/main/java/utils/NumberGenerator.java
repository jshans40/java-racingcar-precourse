package utils;

import nextstep.utils.Randoms;

public class NumberGenerator {
    public int generateRandomNumberRangeZeroToNine() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
