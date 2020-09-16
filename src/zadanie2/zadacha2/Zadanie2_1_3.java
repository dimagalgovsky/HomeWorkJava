package zadanie2.zadacha2;

import java.util.Scanner;

public class Zadanie2_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
//Вывести все элементы в консоль.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.3. for.