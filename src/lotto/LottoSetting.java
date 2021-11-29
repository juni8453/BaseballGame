package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LottoSetting {

    private int count = 0;

    public void settingNumbers() {
        List<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 0; i < 46; i++) {
            lottoNumbers.add(i);
        }

        lottoNumbers.remove(0);
        shuffleNumbers(lottoNumbers);
    }

    public void shuffleNumbers(List<Integer> lottoNumbers) {
        Collections.shuffle(lottoNumbers);
        pickNumbers(lottoNumbers);
    }

    public void pickNumbers(List<Integer> lottoNumbers) {
        if (count < 5) {
            lottoNumbers.stream().limit(6).sorted(Comparator.naturalOrder())
                    .forEach(s -> System.out.print(s + "번" + " "));
            System.out.println();
            count += 1;
            settingNumbers();
        }

        if (count == 5) {
            stopMachine();
        }
    }


    public void stopMachine() {
        System.out.println("=========================");
        System.out.println("자동 추첨을 완료했습니다.");
        System.exit(0);
    }
}
