package gamecontroller;

import java.util.List;
import java.util.Scanner;

// 전체적인 게임 진행을 담당하는 클래스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameSetting setting = new GameSetting();

        System.out.println("================");
        System.out.println("야구게임을 시작합니다.");
        List<String> shuffleNumbers = setting.gameSetting();
        System.out.println(shuffleNumbers);
    }
}
