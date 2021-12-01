package simplerpg.gamemanager;

import simplerpg.hero.Warrior;

public class WarriorStart {

    public void warriorStartGame(String heroName) {
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
}
