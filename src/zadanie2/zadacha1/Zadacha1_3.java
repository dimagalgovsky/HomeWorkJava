package zadanie2.zadacha1;

import java.util.Scanner;

public class Zadacha1_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double chislo = in.nextDouble();

        System.out.println("Введите степень");
        double step = in.nextDouble();


        if (step<0){
            System.out.println("Степерь отрицательная");
            System.exit(0);
        }

        if (step%1 != 0) {
            System.out.println("Степерь дробная");
            System.exit(0);
        }

        double result = 1;
        for (int i = 1; i <= step; i++) {
            result *= chislo;
        }

        System.out.println(result);
    }
}

// Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
// Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и дробным.