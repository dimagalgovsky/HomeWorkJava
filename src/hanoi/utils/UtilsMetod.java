package hanoi.utils;

import hanoi.Hanoi;

import java.util.Scanner;

public class UtilsMetod {
    Hanoi hanoi = new Hanoi();

    public int[] inputData() {
        int[] result = new int[2];

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите режим игры: " + "\n" + "1 - ручной" + "\n" + "2 - автоматический");
        result[0] = in.nextInt();
        System.out.println("Укажите количество колец в игре:");
        do {
            result[1] = in.nextInt();
            if (result[1] < 3 || result[1] > 8) {
                System.out.println("Вы ввели некоректный размер, необходимо указать в диапозоне от 3 до 8."
                        + "\n" + "Введите количество колец еще раз.");
            }
        }
        while (result[1] < 3 || result[1] > 8);
        return result;
    }

    public boolean cheakFinish(int[][] arr) {
        boolean endGame = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] == i + 1) {
                count++;
            }
        }
        if (count == arr.length) {
            endGame = true;
        }
        return endGame;
    }

    public boolean cheakMotion(int[][] arr, int num) {
        boolean result = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][num] > arr[i + 1][num]) {
                result = false;
            }
        }
        return result;
    }
}
