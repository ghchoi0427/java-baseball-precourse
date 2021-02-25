package baseball;

import utils.Data;
import utils.View;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        View view = new View();
        GameManager gameManager = new GameManager();
        Data data = view.data;
        // TODO 구현 진행

        while(data.getCommand()!=2){
            view.inputNumber(scanner);
            data.setTarget(gameManager.generateTarget());
            view.inputNumber(scanner);
            int[] result = gameManager.judge(data.getTarget(), data.getShot());
            if(view.printJudge(result)){
                view.inputCmd(scanner);
            }
        }

    }
}
