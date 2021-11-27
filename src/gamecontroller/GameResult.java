package gamecontroller;

// 게임 결과를 담당하는 클래스
public class GameResult {

    public void gameResult(String playerPickNumbers, String enemyPickNumbers) {
        System.out.println("플레이어의 픽");
        System.out.print(playerPickNumbers.charAt(0) + " ");
        System.out.print(playerPickNumbers.charAt(1) + " ");
        System.out.println(playerPickNumbers.charAt(2));

        System.out.println("상대방의 픽");
        System.out.print(enemyPickNumbers.charAt(0) + " ");
        System.out.print(enemyPickNumbers.charAt(1) + " ");
        System.out.println(enemyPickNumbers.charAt(2));

        // 1 스트라이크
        if (playerPickNumbers.charAt(0) == enemyPickNumbers.charAt(0) &&
            playerPickNumbers.charAt(1) == enemyPickNumbers.charAt(1) &&
            playerPickNumbers.charAt(2) == enemyPickNumbers.charAt(2)) {

            System.out.println("1 스트라이크 입니다.");


            // 1 스트라이크 1볼

            // 1 스트라이크 2볼

            // 2 스트라이크

            // 2 스트라이크 1볼

            // 3 스트라이크

//    public void Strike() {
//
//    }
//
//    public void Ball() {
//
//    }
//
//    public void nothing() {
//
//    }
        }
    }
}
