package zadanie2.zadacha2;

import java.util.Scanner;

public class Zadanie2_3_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int j = arr.length;
        while (j > 0) {
            j--;
            System.out.print(arr[j]+" ");

           }

    }
}
//Вывести все элементы массива в консоль в обратном порядке.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.2. while
