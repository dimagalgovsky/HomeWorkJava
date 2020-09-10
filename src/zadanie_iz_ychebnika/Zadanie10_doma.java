package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie10_doma {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину дома №1");
        int sDom1 = in.nextInt();

        System.out.println("Введите длину дома №1");
        int dDom1 = in.nextInt();

        System.out.println("Введите ширину дома №2");
        int sDom2 = in.nextInt();

        System.out.println("Введите длину дома №2");
        int dDom2 = in.nextInt();

        System.out.println("Введите ширину участка");
        int sYch = in.nextInt();

        Scanner in5 = new Scanner(System.in);
        System.out.println("Введите длину участка");
        int dYch = in5.nextInt();

       int summa1 = sDom1 + sDom2;
       int summa2 = sDom1 + dDom2;
       int summa3 = dDom1 + dDom2;
       int summa4 = dDom1 + sDom2;


        int plDom1 = dDom1 * sDom1;
        int plDom2 = dDom2 * sDom2;
        int plSumDom = plDom1 + plDom2;
        int plYch = dYch * sYch;



//проверить суммы длин домов против участка
    }
}
