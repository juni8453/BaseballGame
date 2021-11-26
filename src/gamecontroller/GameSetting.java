package gamecontroller;

import java.util.List;

public class GameSetting {

    public List<String> gameSetting() {
        Enemy enemy = new Enemy();
        return enemy.shuffleNumbers();
    }
}
