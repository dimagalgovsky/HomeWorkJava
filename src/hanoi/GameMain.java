package hanoi;

import hanoi.utils.UtilsMetod;

import static hanoi.Hanoi.game;

public class GameMain {
    public static void main(String[] args) {

        UtilsMetod utils = new UtilsMetod();
        int[] result = utils.inputData();

        if (result[0] == 1) {
            game(result[1]);
        }
        else {
            System.out.println("Извините, втоматический режим игры в разработке");
        }
    }
}
