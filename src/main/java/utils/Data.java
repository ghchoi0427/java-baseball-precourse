package utils;

public class Data {

    int[] target = new int[3];
    int[] shot = new int[3];
    int command=0;


    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }



    public int[] getTarget() {
        return target;
    }

    public void setTarget(int[] target) {
        this.target = target;
    }

    public int[] getShot() {
        return shot;
    }

    public void setShot(int[] shot) {
        this.shot = shot;
    }

}
