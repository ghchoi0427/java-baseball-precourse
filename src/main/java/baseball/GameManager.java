package baseball;

import utils.RandomUtils;

public class GameManager {

    public int[] generateNumber() {
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

    }


    public int countBall(int target, int targetIndex, int shot, int shotIndex){
        if (target == shot && targetIndex != shotIndex)return 1;
        return 0;
    }

    public void StopGame() {

    }

}
