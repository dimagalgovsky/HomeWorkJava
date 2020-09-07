package zadanie2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int dlina = 6;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
           arr[i] = in.nextInt();
        }
        for (int j = 1; j < dlina; j+=2) {
            System.out.print(arr[j]+" ");
        }
    }
}
//Вывести каждый второй элемент массива в консоль