package gamecontroller;

// 게임 결과를 담당하는 클래스
public class GameResult {
    private int strikeCount = 0;
    private int ballCount = 0;

    public void gameResult(String playerPickNumbers, String enemyPickNumbers) {
        GameStart start = new GameStart();
        calculatorStrikeCount(playerPickNumbers, enemyPickNumbers);

        // 게임을 더 진행해야할 때,
        if (strikeCount != 3) {
            calculatorBallCount(playerPickNumbers, enemyPickNumbers);

            // 스트라이크와 볼 출력
            printCount();

            start.runGame(enemyPickNumbers);
        }

        // 3 스트라이크로 게임이 끝난 경우
        if (strikeCount == 3) {
            System.out.println(strikeCount + "스트라이크 입니다 !");
            System.out.println("게임을 종료합니다.");
            System.exit(0);
        }
    }

    public void printCount() {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("일치하는 숫자가 없습니다 !");
        }

        if (strikeCount == 0 && ballCount != 0) {
            System.out.println(ballCount + "볼");
        }

        if (strikeCount != 0 && ballCount == 0) {
            System.out.println(strikeCount + "스트라이크");
        }

        if (strikeCount != 0 && ballCount != 0) {
            System.out.println(strikeCount + "스트라이크");
            System.out.println(ballCount + "볼");
        }
    }

    // 3 스트라이크가 아니라면 볼이 있을 수도 있으니까 검사해주는 메소드 생성
    public void calculatorBallCount(String playerPickNumbers, String enemyPickNumbers) {
        for (int i = 0; i < playerPickNumbers.length(); i++) {
            for (int j = 0; j < enemyPickNumbers.length(); j++) {
                if (playerPickNumbers.charAt(i) == enemyPickNumbers.charAt(j) && i != j) {
                    ballCount += 1;
                }
            }
        }
    }

    public void calculatorStrikeCount(String playerPickNumbers, String enemyPickNumbers) {
        for (int i = 0; i < playerPickNumbers.length(); i++) {
            // 상대방의 숫자와 플레이어의 숫자를 각 자리마다 비교해서 같은 숫자가 있다면 strikeCount + 1
            if (playerPickNumbers.charAt(i) == enemyPickNumbers.charAt(i)) {
                strikeCount += 1;
            }
        }
    }
}
