package simplerpg.monster.perion.beginnerMonster;

import simplerpg.monster.MonsterInterface;

public class Stump implements MonsterInterface {

    private int healthPoint;
    private int attackPoint;
    private int money;

    public Stump() {
        this(40, 5, 5);
    }

    Stump(int healthPoint, int attackPoint, int money) {
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
        this.money = money;
    }

    @Override
    public void attackedHero(int attackDamage) {
        this.healthPoint = this.healthPoint - attackDamage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public int getMoney() {
        return money;
    }
}
