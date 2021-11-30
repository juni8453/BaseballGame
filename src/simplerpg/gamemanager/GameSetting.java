package simplerpg.gamemanager;

import simplerpg.hero.Archer;
import simplerpg.hero.Mage;
import simplerpg.hero.Thief;
import simplerpg.hero.Warrior;

import java.util.Scanner;

public class GameSetting {
    Scanner sc = new Scanner(System.in);

    public void choiceHero() {
        System.out.println("직업을 선택하십시오.");
        System.out.println("[1]전사 [2]궁수 [3]마법사 [4]도적");
        int choiceHeroNumber = sc.nextInt();

        System.out.println("영웅의 이름을 입력해주세요.");
        String heroName = sc.next();

        if (choiceHeroNumber == 1) {
            Warrior warrior = new Warrior(heroName);
        }

        if (choiceHeroNumber == 2) {
            Archer archer = new Archer(heroName);
        }

        if (choiceHeroNumber == 3) {
            Mage mage = new Mage(heroName);
        }

        if (choiceHeroNumber == 4) {
            Thief thief = new Thief(heroName);
        }
    }
}
