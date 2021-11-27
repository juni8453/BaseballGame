package gamecontroller;

import java.util.Scanner;

// 전체적인 게임 진행을 담당하는 클래스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameSetting setting = new GameSetting();
        GameStart start = new GameStart();

        System.out.println("================");
        System.out.println("야구게임을 시작합니다.");

        String enemyPickNumbers = setting.gameSetting();

        System.out.println("상대방이 고른 숫자 (테스트) " + enemyPickNumbers);

        start.runGame(enemyPickNumbers);
    }
}
