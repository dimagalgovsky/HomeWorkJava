package hanoi;

import hanoi.utils.UtilsMetod;

import static hanoi.Hanoi.gameAuto;
import static hanoi.Hanoi.gameHand;

public class GameMain {
    public static void main(String[] args) {

        UtilsMetod utils = new UtilsMetod();
        int[] result = utils.inputData();

        if (result[0] == 1) {
            gameHand(result[1]);
        }
        else {
            gameAuto(result[1]);
        }
    }
}
