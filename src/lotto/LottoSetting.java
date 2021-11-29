package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoSetting {

    public void setNumbers() {
        List<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 0; i < 46; i++) {
            lottoNumbers.add(i);
        }

        lottoNumbers.remove(0);

    }
}
