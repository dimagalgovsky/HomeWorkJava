package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9_data {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
        int den = in.nextInt();
            // проверка данных
             if ((den>31) || (den==0)){
                 System.out.println("Вы ввели некоректное число");
                 System.exit(0);
             }

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите месяц");
        int mes = in1.nextInt();
            // проверка данных
            if ((mes>12) || (mes==0)) {
                System.out.println("Вы ввели некоректное число");
                System.exit(0);
            }

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите год");
        int god = in2.nextInt();

        if ((den>=1) && (den<=27)) {
            den += 1;
            System.out.println(den+"."+mes+"."+god);
            System.exit(0);}

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (den == 31) {
                    den = 1;
                    mes += 1;
                    break;
                }
                else {
                    den += 1;
                    break;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (den == 31) {
                    System.out.println("Вы ввели некоректную дату, в этом месяце нет 31-ого числа");
                    System.exit(0);
                }
                if (den == 30) {
                    den = 1;
                    mes += 1;
                    break;
                }
                else {
                    den += 1;
                    break;
                }

            case 12:
                if (den == 31) {
                    den = 1;
                    mes = 1;
                    god += 1;
                    break;
                }
                else {
                    den += 1;
                    break;
                }

            case 2:
                if ((den == 30) || (den ==31)) {
                  System.out.println("Вы ввели некоректную дату, в этом месяце нет таких чисел");
                  System.exit(0);
                }

                if (god%4 == 0 && god%100 != 0 || god%400 == 0) {
                    if (den == 29) {
                        den = 1;
                        mes += 1;
                        break;
                    }
                    else {
                        den += 1;
                        break;
                    }
                  }

                else {
                    if (den == 29) {
                        System.out.println("Вы ввели некоректную дату, это не высокосный год");
                        System.exit(0);

                    }
                    else {
                        den = 1;
                        mes += 1;
                        break;
                    }
                }
        }
        System.out.println(den+"."+mes+"."+god);
    }
}
