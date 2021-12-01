package simplerpg.gamemanager;

import simplerpg.hero.Thief;

public class ThiefStart {

    public void thiefStartGame(String heroName) {
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
