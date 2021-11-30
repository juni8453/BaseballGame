package simplerpg.hero;

public class Archer implements HeroInterface {
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int attackPoint;
    private int defencePoint;

    public Archer(String name) {
        this(200, 150, 12, 8);
        this.name = name;
    }

    Archer(int healthPoint, int manaPoint, int attackPoint, int defencePoint) {
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
