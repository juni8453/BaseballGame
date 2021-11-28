package gamecontroller;

// 전체적인 게임 진행을 담당하는 클래스
public class Main {
    public static void main(String[] args) {
        GameSetting setting = new GameSetting();
        GameStart start = new GameStart();

        System.out.println("================");
        System.out.println("야구게임을 시작합니다.");

        String enemyPickNumbers = setting.gameSetting();

        start.runGame(enemyPickNumbers);
    }
}
