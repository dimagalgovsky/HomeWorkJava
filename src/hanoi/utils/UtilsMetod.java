package hanoi.utils;

import hanoi.Hanoi;

import java.util.Scanner;

public class UtilsMetod {
    Hanoi hanoi = new Hanoi();

//ввод начальных условий
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

//метод вывода в консоль массива
    public void printArray(int[][] arr) {
        System.out.print("-------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" " + "*" + " ");
                } else {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

//проверка на окончание игры
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

//проверка на возможность хода
    public boolean cheakMotion(int[][] arr, int outNum, int inNum, int column, int column1) {
        boolean result = true;
        if ((inNum != arr.length - 1) && (inNum != 0)) {
            inNum++;
            if (arr[outNum][column] > arr[inNum][column1]) {
                result = false;
            }
        }
        return result;
    }
}
