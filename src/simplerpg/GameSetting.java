package simplerpg;

import java.util.Scanner;

public class GameSetting {
    Scanner sc = new Scanner(System.in);
    Player player = new Player();

    public void choiceHero() {
        System.out.println("직업을 선택하십시오.");
        System.out.println("[1]전사 [2]마법사 [3]궁수 [4]도적");
        int choiceNumber = sc.nextInt();

        if (choiceNumber == 1) {
            player.buildWarrior();
        }

        if (choiceNumber == 2) {
            player.buildMage();
        }

        if (choiceNumber == 3) {
            player.buildArcher();
        }

        if (choiceNumber == 4) {
            player.buildThief();
        }
    }
}
