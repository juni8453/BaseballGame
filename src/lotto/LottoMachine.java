package lotto;

public class LottoMachine {
    public static void main(String[] args) {

        LottoSetting setting = new LottoSetting();
        System.out.println("로또번호 자동 추첨을 시작합니다.");
        System.out.println("=========================");
        setting.settingNumbers();
    }
}
