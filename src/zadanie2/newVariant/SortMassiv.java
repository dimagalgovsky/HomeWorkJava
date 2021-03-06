package zadanie2.newVariant;

import zadanie2.zadacha4.Zadanie4_sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortMassiv {

    public static Random rand = new Random();

    public static void massive(){

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер массива для сортировки: \n№1: {1,2,3,4,5,6} \n№2: {1,1,1,1} \n№3: {9,1,5,99,9,9}");
        System.out.println("№4: {} \n№5: Массив произвольной длины с произвольными данными \n№6: Ввести массив с клавиатуры");
        int num = input.nextInt();
        int[] array;

        switch (num) {
            case 1:
                array = new int[]{1, 2, 3, 4, 5, 6};
                break;
            case 2:
                array = new int[]{1, 1, 1, 1};
                break;
            case 3:
                array = new int[]{9, 1, 5, 99, 9, 9};
                break;
            case 4:
                array = new int[]{};
                break;
            case 5 :
                int lenght = rand.nextInt(100)+1;
                array = new int[lenght];

                for (int i = 0; i < lenght ; i++)
                {
                    array[i] = (rand.nextInt(100)+1);
                }
                break;
            case 6:
                System.out.println("Введите размер массива:");
                int lenght1 = input.nextInt();
                array = new int[lenght1];

                System.out.println("Введите числа массива("+lenght1+")");
                for (int i = 0; i < lenght1; i++) {
                    array[i] = input.nextInt();
                }
                break;
            default:
               throw new IllegalStateException("Unexpected value: " + num);    //спросить Илью
        }

        System.out.println("Выберите способ сортировки: \n№1 - пузырьковая \n№2 - шейкерная");
        int num1 = input.nextInt();

            System.out.println("массив №"+num+" перед сортировкой : " + Arrays.toString(array));

            if (num1 == 1){
                Zadanie4_sort.bubl(array);
                System.out.println("массив №"+num+" после пузырьковой сортировки : " + Arrays.toString(array));
            }
            else {
                Zadanie4_sort.sheik(array);
                System.out.println("массив №"+num+" после шейкернойсортировки : " + Arrays.toString(array));
            }
    }
}



