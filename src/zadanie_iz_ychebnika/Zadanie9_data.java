package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9_data {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
        int den = in.nextInt();

// проверить на корректность входных данных
      //  if (den>12) {
      //      System.out.println("Ввели некоректное число");
      //  }

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите месяц");
        int mes = in1.nextInt();

// проверить на корректность входных данных
      //      if (mes>12) {
      //          System.out.println("Ввели некоректное число");
      //      }

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите год");
        int god = in2.nextInt();

        if (den>=1 && den<=27) {
            den += 1;
            System.out.println(den+"."+mes+"."+god);
        }



    }
}
// 1   31
// 2   проверь на высокосный
// 3   31
// 4   30
// 5   31
// 6   30
// 7   31
// 8   31
// 9   30
// 10  31
// 11  30
// 12  31 - нужно изменить и год