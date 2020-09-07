package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie10_doma {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину дома №1");
        int sDom1 = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите длину дома №1");
        int dDom1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите ширину дома №2");
        int sDom2 = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите длину дома №2");
        int dDom2 = in3.nextInt();

        Scanner in4 = new Scanner(System.in);
        System.out.println("Введите ширину участка");
        int sYch = in4.nextInt();

        Scanner in5 = new Scanner(System.in);
        System.out.println("Введите длину участка");
        int dYch = in5.nextInt();

        // проверка длин сторон против участка
        // проверка сумм длин сторон против участка сразу 2 сторон
        // сумма площадей

        boolean uslStDl = ((sYch > sDom1) && (sYch > sDom2) && (sYch > dDom1) && (sYch > dDom2)); //если все ок-true
        boolean uslStSh = ((dYch > sDom1) && (dYch > sDom2) && (dYch > dDom1) && (dYch > dDom2));

        boolean uslStShSum = ((sYch >= (sDom1+sDom2)) && (sYch >= (sDom1+dDom2)) && (sYch >= (dDom1+sDom2)) && (sYch >= (dDom1+dDom2))); //если все ок-true
        boolean uslStDlSum = ((dYch >= (sDom1+sDom2)) && (dYch >= (sDom1+dDom2)) && (dYch >= (dDom1+sDom2)) && (dYch >= (dDom1+dDom2)));


        int plDom1 = dDom1 * sDom1;
        int plDom2 = dDom2 * sDom2;
        int plYch = dYch * sYch;




    }
}
