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

    public void printJudge(int[] judge){
        String line = "";

        if(judge[0]!=0){
            line+=judge[0]+"볼 ";
        }
        if(judge[1]!=0){
            line+=judge[1]+"스트라이크 ";
        }

        System.out.println(line);
    }

    public void inputCmd(Scanner sc){
        int cmd = sc.nextInt();
        data.command=cmd;
    }
}
