package gamecontroller;

import java.util.List;

public class GameSetting {

    public List<Integer> gameSetting() {
        Enemy enemy = new Enemy();
        List<Integer> shuffleResult = enemy.shuffleNumbers();

        return shuffleResult;
    }
}
