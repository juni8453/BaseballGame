package simplerpg.gamemanager;

import simplerpg.hero.Archer;
import simplerpg.hero.Mage;
import simplerpg.hero.Thief;
import simplerpg.hero.Warrior;

public class Run {
    public void startGame(int choiceHeroNumber, String heroName) {
        if (choiceHeroNumber == 1) {
            Warrior warrior = new Warrior(heroName);
            System.out.println("전사 클래스를 선택하셨습니다.");
            System.out.println("영웅의 이름은 " + warrior.getName() + "입니다.");
            System.out.println("현재 레벨 : " + warrior.getLevel());
            System.out.println("현재 소지금액 : " + warrior.getMoney());
            System.out.println("현재 보유 체력 : " + warrior.getHealthPoint());
            System.out.println("현재 보유 마나 : " + warrior.getManaPoint());
            System.out.println("현재 공격력 : " + warrior.getAttackPoint());
            System.out.println("현재 방어력 : " + warrior.getDefencePoint());
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
