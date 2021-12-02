package simplerpg.map.perion.huntingstage;

import simplerpg.hero.Warrior;
import simplerpg.monster.perion.beginnerMonster.Stump;

import java.util.Scanner;

public class PerionBeginnerHuntingStage {

    public void entranceBrginner(Warrior warrior) {
        System.out.println("전사 초보자 사냥터에 입장하셨습니다.");
        System.out.println("어떤 몬스터를 사냥하십니까 ?");
        System.out.println("스텀프 사냥[1]");
        Scanner sc = new Scanner(System.in);
        int checkHuntingMonster = sc.nextInt();

        // 스텀프 사냥
        if (checkHuntingMonster == 1) {
            System.out.println("스텀프를 사냥합니다.");
            Stump stump = new Stump();
            huntingMonster(warrior, stump);
        }
    }

    public void huntingMonster(Warrior warrior, Stump stump) {
        while(true) {
            if (stump.getHealthPoint() <= 0) {
                System.out.println("스텀프가 죽었습니다.");

            }
            System.out.println("스텀프가 영웅을 공격합니다 !");
            warrior.attackedMonster(stump.getAttackPoint());
            System.out.println("현재 영웅의 체력 : " + warrior.getHealthPoint());

            System.out.println("영웅이 스텀프를 공격합니다 !");
            stump.attackedHero(warrior.getAttackPoint());
            System.out.println("현재 스텀프의 체력 : " + stump.getHealthPoint());
        }
    }
}
