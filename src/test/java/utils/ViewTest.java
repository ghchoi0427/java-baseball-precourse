package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {
    View view = new View();

    @Test
    public void printjudge(){
        view.printJudge(new int[]{0,1});
    }

}