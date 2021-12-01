package simplerpg.hero;

public class Warrior implements HeroInterface {
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int attackPoint;
    private int defencePoint;
    private int money;
    private int level;

    public Warrior(String name) {
        this(300, 100, 15, 10, 50, 1);
        this.name = name;
    }

    Warrior(int healthPoint, int manaPoint, int attackPoint, int defencePoint, int money, int level) {
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
        this.money = money;
        this.level = level;
    }

    // 구현 보류
    @Override
    public void settingHero() {

    }
}

