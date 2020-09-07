package zadanie2;

import java.util.Scanner;

public class Zadanie2_3_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int dlina = 5;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
           arr[i] = in.nextInt();
        }

        int j = dlina;
        while (j > 0) {
            j--;
            System.out.print(arr[j]+" ");

           }

    }
}
//Вывести все элементы массива в консоль в обратном порядке.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.2. while
