package zadanie2;

import java.util.Scanner;

public class Zadanie2_1_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int dlina = 5;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
           arr[i] = in.nextInt();
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
