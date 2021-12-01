package simplerpg.gamemanager;

import simplerpg.hero.Archer;
import simplerpg.hero.Mage;
import simplerpg.hero.Thief;
import simplerpg.hero.Warrior;

public class Run {

    public void startGame(int choiceHeroNumber, String heroName) {
        if (choiceHeroNumber == 1) {
            Warrior warrior = new Warrior(heroName);
        }

        if (choiceHeroNumber == 2) {
            Archer archer = new Archer(heroName);
        }

        if (choiceHeroNumber == 3) {
            Mage mage = new Mage(heroName);
        }

        if (choiceHeroNumber == 4) {
            Thief thief = new Thief(heroName);
        }
    }
}
