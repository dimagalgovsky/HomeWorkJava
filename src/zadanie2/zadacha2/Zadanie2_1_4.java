package zadanie2.zadacha2;

import java.util.Scanner;

public class Zadanie2_1_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }
}
//Вывести все элементы в консоль.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.4. foreach.