package simplerpg.gamemanager;

import simplerpg.hero.Warrior;
import simplerpg.map.perion.PerionTown;
import simplerpg.map.perion.huntingstage.PerionBeginnerHuntingStage;
import simplerpg.map.perion.huntingstage.PerionExpertHuntingStage;
import simplerpg.map.perion.huntingstage.PerionMasterHuntingStage;

import java.util.Scanner;

public class WarriorStart {

    public void warriorStartGame(String heroName) {
        Warrior warrior = new Warrior(heroName);
        PerionTown perionTown = new PerionTown();

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

        int checkMove = perionTown.entrancePerion();

        // 사냥터 이동 선택 시
        if (checkMove == 1) {
            System.out.println("어떤 사냥터로 이동하십니까 ?");
            System.out.println("초보자 사냥터[1] 중급자 사냥터[2] 마스터 사냥터[3]");
            int checkHuntingStage = sc.nextInt();

            if (checkHuntingStage == 1) {
                PerionBeginnerHuntingStage beginnerStage = new PerionBeginnerHuntingStage();
                beginnerStage.entranceBrginner(warrior);
            }

            if (checkHuntingStage == 2) {
                PerionExpertHuntingStage expertStage = new PerionExpertHuntingStage();
                expertStage.entranceExpert();
            }

            if (checkHuntingStage == 3) {
                PerionMasterHuntingStage masterStage = new PerionMasterHuntingStage();
                masterStage.entranceMaster();
            }
        }

        // 포션 상점 이동 시
        if (checkMove == 2) {

        }

        // 장비 상점 이동 시
        if (checkMove == 3) {

        }
    }
}
