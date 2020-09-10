package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int n = input.nextInt();

            int[] array = new int[n];

            System.out.println("Введите " + n + " чисел");

            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }

            System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));
            BubbleSorter.sort(array);
            System.out.println("массив после пузырьковой сортировкой : " + Arrays.toString(array));

        }
    }

