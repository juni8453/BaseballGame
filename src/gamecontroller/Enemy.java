package gamecontroller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Enemy {

    // 컴퓨터가 뽑은 숫자를 랜덤하게 섞는다.
    public List<Integer> shuffleNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(numbers);
            return numbers;
    }

    // 숫자열 -> 문자열 -> 앞 3글자만 잘라서 return
    public String enemyPickNumbers(List<Integer> shuffleResult) {
        String shuffleNumbersJoin = shuffleNumbers().stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return shuffleNumbersJoin.substring(0, 3);
    }
}
