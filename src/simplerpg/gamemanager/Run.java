package simplerpg.gamemanager;

public class Run {
    WarriorStart warriorStart = new WarriorStart();
    ArcherStart archerStart = new ArcherStart();
    MageStart mageStart = new MageStart();
    ThiefStart thiefStart = new ThiefStart();

    public void startGame(int choiceHeroNumber, String heroName) {
        if (choiceHeroNumber == 1) {
            warriorStart.warriorStartGame(heroName);
        }

        if (choiceHeroNumber == 2) {
            archerStart.archerStartGame(heroName);
        }

        if (choiceHeroNumber == 3) {
            mageStart.mageStartGame(heroName);
        }

        if (choiceHeroNumber == 4) {
            thiefStart.thiefStartGame(heroName);
        }
    }
}
