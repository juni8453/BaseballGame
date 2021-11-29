package lotto;

import java.util.*;

public class LottoSetting {

    private int count = 0;
    private int buyerWantCount = 0;

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
        Scanner sc = new Scanner(System.in);
        if (count == 0) {
            System.out.println("몇 개를 추천받으십니까 ?");
            buyerWantCount = sc.nextInt();
        }

        if (count < buyerWantCount) {
            lottoNumbers.stream().limit(6).sorted(Comparator.naturalOrder())
                    .forEach(s -> System.out.print(s + "번" + " "));
            System.out.println();
            count += 1;
            settingNumbers();
        }

        if (count == buyerWantCount) {
            stopMachine();
        }
    }

    public void stopMachine() {
        System.out.println("=========================");
        System.out.println("자동 추첨을 완료했습니다.");
        System.exit(0);
    }
}
