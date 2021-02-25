package baseball;

import utils.RandomUtils;

public class GameManager {

    public int[] generateNumber() {
        int[] numbers = new int[3];
        numbers[0] = RandomUtils.nextInt(1, 9);
        numbers[1] = RandomUtils.nextInt(1, 9);
        numbers[2] = RandomUtils.nextInt(1, 9);

        return numbers;
    }

    public void startGame() {

    }

    public void judge() {

    }

    public void StopGame() {

    }

}
