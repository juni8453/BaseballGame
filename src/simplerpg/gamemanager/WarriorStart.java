package simplerpg.gamemanager;

import simplerpg.hero.Warrior;

import java.util.Scanner;

public class WarriorStart {

    public void warriorStartGame(String heroName) {
        Warrior warrior = new Warrior(heroName);
        Scanner sc = new Scanner(System.in);

        System.out.println("전사 클래스를 선택하셨습니다.");
        System.out.println("영웅의 이름은 " + warrior.getName() + "입니다.");
        System.out.println("현재 레벨 : " + warrior.getLevel());
        System.out.println("현재 소지금액 : " + warrior.getMoney());
        System.out.println("현재 보유 체력 : " + warrior.getHealthPoint());
        System.out.println("현재 보유 마나 : " + warrior.getManaPoint());
        System.out.println("현재 공격력 : " + warrior.getAttackPoint());
        System.out.println("현재 방어력 : " + warrior.getDefencePoint());
        System.out.println("=======================");

        System.out.println("사냥터 이동[1] 상점 이동[2]");
        int checkNumber = sc.nextInt();

        if (checkNumber == 1) {
            System.out.println("어떤 사냥터에 입장하십니까?");
            System.out.println("현재 레벨로 갈 수 있는 사냥터는 " + "입니다.");
        }

        if (checkNumber == 2) {

        }
    }
}
