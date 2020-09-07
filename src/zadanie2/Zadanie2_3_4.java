package zadanie2;

import java.util.Scanner;

public class Zadanie2_3_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int dlina = 6;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
           arr[i] = in.nextInt();
        }
        for (int j = 0; j < dlina / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[dlina - 1 - j];
            arr[dlina - 1 - j] = temp;
        }
            for (int a: arr) {
            System.out.print(a+" ");
        }
    }
}
//Вывести все элементы массива в консоль в обратном порядке.
// Элементы массива вводить через консоль. Массив хранит в себе числа. Выводить при помощи:
//		2.1.4. foreach.