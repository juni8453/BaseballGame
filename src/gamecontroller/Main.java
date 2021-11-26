package gamecontroller;

import java.util.List;
import java.util.Scanner;

// 전체적인 게임 진행을 담당하는 클래스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameSetting setting = new GameSetting();

        GameResult result = new GameResult();

        System.out.println("================");
        System.out.println("야구게임을 시작합니다.");

        // 섞은 난수를 shuffleNumbers 변수에 저장한다.
        List<String> shuffleNumbers = setting.gameSetting();

        // 플레이어는 세자리 숫자를 입력한다.
        System.out.print("숫자를 입력해주세요 ! 예) 123 ");
        int playerPickNumbers = sc.nextInt();
        result.gameResult();
    }
}
