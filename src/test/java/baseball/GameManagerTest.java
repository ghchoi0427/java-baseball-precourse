package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class GameManagerTest {
        GameManager gameManager = new GameManager();

        @Test
        public void overlapNumber(){
                int[] arr = gameManager.generateTarget();
                assertTrue(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]);

        }

        @Test
        public void judgement(){
                int[] target = new int[]{1,2,3};
                int[] shot = new int[]{3,4,5};

                int[] result = gameManager.judge(target,shot);

                assertThat(result[0]).isEqualTo(1);
                assertThat(result[1]).isEqualTo(0);

        }
}