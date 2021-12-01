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
            System.out.println("궁수 클래스를 선택하셨습니다.");
            System.out.println("영웅의 이름은 " + archer.getName() + "입니다.");
            System.out.println("현재 레벨 : " + archer.getLevel());
            System.out.println("현재 소지금액 : " + archer.getMoney());
            System.out.println("현재 보유 체력 : " + archer.getHealthPoint());
            System.out.println("현재 보유 마나 : " + archer.getManaPoint());
            System.out.println("현재 공격력 : " + archer.getAttackPoint());
            System.out.println("현재 방어력 : " + archer.getDefencePoint());
        }

        if (choiceHeroNumber == 3) {
            Mage mage = new Mage(heroName);
            System.out.println("마법사 클래스를 선택하셨습니다.");
            System.out.println("영웅의 이름은 " + mage.getName() + "입니다.");
            System.out.println("현재 레벨 : " + mage.getLevel());
            System.out.println("현재 소지금액 : " + mage.getMoney());
            System.out.println("현재 보유 체력 : " + mage.getHealthPoint());
            System.out.println("현재 보유 마나 : " + mage.getManaPoint());
            System.out.println("현재 공격력 : " + mage.getAttackPoint());
            System.out.println("현재 방어력 : " + mage.getDefencePoint());
        }

        if (choiceHeroNumber == 4) {
            Thief thief = new Thief(heroName);
            System.out.println("도적 클래스를 선택하셨습니다.");
            System.out.println("영웅의 이름은 " + thief.getName() + "입니다.");
            System.out.println("현재 레벨 : " + thief.getLevel());
            System.out.println("현재 소지금액 : " + thief.getMoney());
            System.out.println("현재 보유 체력 : " + thief.getHealthPoint());
            System.out.println("현재 보유 마나 : " + thief.getManaPoint());
            System.out.println("현재 공격력 : " + thief.getAttackPoint());
            System.out.println("현재 방어력 : " + thief.getDefencePoint());
        }
    }
}
