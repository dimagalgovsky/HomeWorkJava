package zadanie2;

import java.util.Scanner;

public class Zadanie2_1_2 {
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
        while (j < arr.length) {
               System.out.print(arr[j]+" ");
               j++;
           }

    }
}
//Вывести все элементы в консоль.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.2. while
