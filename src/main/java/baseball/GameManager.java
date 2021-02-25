package baseball;

import utils.Data;
import utils.RandomUtils;
import utils.View;

public class GameManager {
    View view = new View();
    Data data = view.data;

    public int[] generateTarget() {
        int[] numbers = new int[3];
        numbers[0] = RandomUtils.nextInt(1, 9);

        while (!(numbers[0] != numbers[1] && numbers[0] != numbers[2] && numbers[1] != numbers[2])) {
            numbers[1] = RandomUtils.nextInt(1, 9);
            numbers[2] = RandomUtils.nextInt(1, 9);
        }
        return numbers;
    }

    public void startGame() {

    }

    public int[] judge(int[] target, int[] shot) {
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ball += countBall(target[i], i, shot[j], j);
                strike += countStrike(target[i], i, shot[j], j);
            }
        }
        return new int[]{ball, strike};
    }


    public int countBall(int target, int targetIndex, int shot, int shotIndex) {
        if (target == shot && targetIndex != shotIndex) {
            return 1;
        }
        return 0;
    }

    public int countStrike(int target, int targetIndex, int shot, int shotIndex) {
        if (target == shot && targetIndex == shotIndex) {
            return 1;
        }
        return 0;
    }


    public void StopGame() {

    }

}
