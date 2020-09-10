package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorter {
    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j =array.length-1; j > i; j--) {
                if (array[j-1] > array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    }
                }
            }
        }
    }

//Нарисовать блок схему алгоритма работы пузырьковой сортировки.
//draw io

