package simplerpg.gamemanager;

import simplerpg.hero.Mage;

public class MageStart {

    public void mageStartGame(String heroName) {
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
}
