package gamecontroller;

// 게임 결과를 담당하는 클래스
public class GameResult {
    private int strikeCount = 0;
    private int ballCount = 0;

    public void gameResult(String playerPickNumbers, String enemyPickNumbers) {
        GameStart start = new GameStart();
        strike(playerPickNumbers, enemyPickNumbers);

        // 게임을 계속 진행해야 할 때,
        if (strikeCount != 3) {
            System.out.println(strikeCount + "스트라이크");
            if (ballCount != 0) {
                System.out.println(ballCount + "볼");
            }

            start.runGame(enemyPickNumbers);
        }

        // 3 스트라이크로 게임이 끝난 경우
        if (strikeCount == 3) {
            System.out.println(strikeCount + "스트라이크 입니다 !");
            System.out.println("게임을 종료합니다.");
            System.exit(0);
        }
    }

    public void strike(String playerPickNumbers, String enemyPickNumbers) {
        for (int i = 0; i < playerPickNumbers.length(); i++) {
            if (playerPickNumbers.charAt(i) == enemyPickNumbers.charAt(i)) {
                strikeCount += 1;
            }
        }
    }
}

// 1 스트라이크

// 1 스트라이크 1볼

// 1 스트라이크 2볼

// 2 스트라이크

// 2 스트라이크 1볼

// 3 스트라이크

