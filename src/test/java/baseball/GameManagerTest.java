package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class GameManagerTest {
        GameManager gameManager = new GameManager();

        public void overlapNumber(){
                int[] arr = gameManager.generateNumber();
                assertTrue(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]);

        }
}