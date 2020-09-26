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

        System.out.println("Введите длину участка");
        int dYch = in.nextInt();

        int summa1 = sDom1 + dDom2;
        int summa2 = sDom1 + sDom2;
        int summa3 = dDom1 + dDom2;
        int summa4 = dDom1 + sDom2;

        boolean uslovie1 = summa1 < dYch;
        boolean uslovie2 = summa1 < sYch;
        boolean uslovie3 = summa2 < dYch;
        boolean uslovie4 = summa2 < sYch;
        boolean uslovie5 = summa3 < dYch;
        boolean uslovie6 = summa3 < sYch;
        boolean uslovie7 = summa4 < dYch;
        boolean uslovie8 = summa4 < sYch;


        int plSumDom = (dDom1 * sDom1) + (dDom2 * sDom2);
        int plYch = dYch * sYch;

        if (plYch < plSumDom) {
            System.out.println("Участки не влезут");
            return;
        } else if (uslovie1 && uslovie2 && uslovie3 && uslovie4 && uslovie5
                && uslovie6 && uslovie7 && uslovie8){
            System.out.println("Участки влезут");
        }
            else {
                System.out.println("Участки не влезут");
        }

    }
}
