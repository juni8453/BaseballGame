package gamecontroller;

import java.util.Scanner;

public class GameStart {

    public void runGame(String enemyPickNumbers) {
        Scanner sc = new Scanner(System.in);
        GameResult result = new GameResult();

        // 플레이어는 세자리 숫자를 입력한다.
        System.out.print("숫자를 입력해주세요 ! 예) 123 ");
        String playerPickNumbers = sc.next();

        while(playerPickNumbers.length() != 3) {
            System.out.print("3자리수를 입력해주세요 ! ");
            playerPickNumbers = sc.next();
        }

        result.gameResult(playerPickNumbers, enemyPickNumbers);
    }
}

