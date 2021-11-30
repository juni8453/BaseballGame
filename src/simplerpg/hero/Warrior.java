package simplerpg.hero;

public class Warrior implements HeroInterface {
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int attackPoint;
    private int defencePoint;

    public Warrior(String name) {
        this(300, 100, 15, 10);
        this.name = name;
    }

    Warrior(int healthPoint, int manaPoint, int attackPoint, int defencePoint) {
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
    }

    // 구현 보류
    @Override
    public void settingHero() {

    }
}

