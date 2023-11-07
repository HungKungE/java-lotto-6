package lotto.core;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

import static lotto.constValue.ConstNumber.*;

public class Random {
    public static List<Integer> getRandomNumbers(){
        return Randoms.pickUniqueNumbersInRange(MIX_LOTTO_NUMBER,MAX_LOTTO_NUMBER,LOTTO_NUMBER_LENGTH);
    }
}
