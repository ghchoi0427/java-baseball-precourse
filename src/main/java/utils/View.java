package utils;

import baseball.GameManager;

import java.util.Scanner;

public class View {
    GameManager gameManager = new GameManager();
    Data data = new Data();

    public void inputNumber(Scanner sc) {

        System.out.print("숫자를 입력해주세요 : ");
        String str = sc.nextLine();
        int[] shot = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            shot[i] = str.charAt(i);
        }
        data.target = gameManager.generateTarget();
        data.shot = shot;


    }
}
