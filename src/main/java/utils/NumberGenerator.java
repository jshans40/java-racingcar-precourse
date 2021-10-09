package utils;

import nextstep.utils.Randoms;

public class NumberGenerator {
    public static int generateRandomNumberRangeZeroToNine() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
