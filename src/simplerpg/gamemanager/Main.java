package simplerpg.gamemanager;

public class Main {
    public static void main(String[] args) {
        GameSetting setting = new GameSetting();
        System.out.println("Simple RPG 게임을 시작합니다.");
        System.out.println("=========================");

        // 영웅 클래스 선택
        setting.choiceHero();
    }
}
