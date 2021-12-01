package simplerpg.map.perion;

import java.util.Scanner;

public class PerionTown {

    public int entrancePerion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("페리온에 오신 것을 환영합니다 !");
        System.out.println("사냥터 이동[1] 포션 상점 이동[2] 장비 상점 이동[3]");
        return sc.nextInt();
    }
}
