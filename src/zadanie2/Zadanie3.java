package zadanie2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {






        public void bubbleSorter() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите числа");
            int dlina = 6;
            int[] arr = new int[dlina];

            for (int i = 0; i < dlina; i++) {
                arr[i] = in.nextInt();//МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
                for (int out = (dlina - 1); out >= 1; out--) {  //Внешний цикл
                    for (int in = 0; in < out; in++) {       //Внутренний цикл
                        if (arr[in] > arr[in + 1])               //Если порядок элементов нарушен
                            toSwap(in, in + 1);
                    }
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");

                }
            }
    }
}
//пузырьковая сортировка