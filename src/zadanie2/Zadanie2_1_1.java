package zadanie2;

import java.util.Scanner;

public class Zadanie2_1_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int j = 0;
           do {
               System.out.print(arr[j]+" ");
               j++;
           }
               while (j < arr.length);
    }
}
//Вывести все элементы в консоль.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.1. do....while
