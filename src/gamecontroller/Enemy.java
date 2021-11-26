package gamecontroller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Enemy {

    // 컴퓨터가 뽑은 숫자를 랜덤하게 섞는다.
    public List<Integer> shuffleNumbers() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Collections.shuffle(numbers);
            return numbers;
    }
}
