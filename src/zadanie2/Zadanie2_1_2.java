package zadanie2;

import java.util.Scanner;

public class Zadanie2_1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int dlina = 5;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
           arr[i] = in.nextInt();
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
