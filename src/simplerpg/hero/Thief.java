package simplerpg.hero;

public class Thief implements HeroInterface {
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int attackPoint;
    private int defencePoint;

    public Thief(String name) {
        this(150, 150, 13, 8);
        this.name = name;
    }

    Thief(int healthPoint, int manaPoint, int attackPoint, int defencePoint) {
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
