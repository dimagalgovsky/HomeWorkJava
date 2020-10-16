package hanoi;

import hanoi.utils.UtilsMetod;

import static hanoi.Hanoi.game;

public class GameMain {
    public static void main(String[] args) {

        UtilsMetod utils = new UtilsMetod();
        int[] result =  utils.inputData();
        game(result[1]);
    }
}
