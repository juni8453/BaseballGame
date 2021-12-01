package simplerpg.gamemanager;

import simplerpg.hero.Archer;

public class ArcherStart {

    public void archerStartGame(String heroName) {

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
}
