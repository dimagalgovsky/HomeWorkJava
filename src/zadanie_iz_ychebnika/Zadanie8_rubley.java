package zadanie_iz_ychebnika;


import java.util.Arrays;
import java.util.Scanner;

public class Zadanie8_rubley {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму");
        int summa = in.nextInt();

        if (summa%10==1 && summa%100!=11)
            System.out.println(summa +" "+"Рубль");
        if (summa%10==2 && summa%100!=12)
            System.out.println(summa +" "+"Рубля");
        if (summa%10==3 && summa%100!=13)
            System.out.println(summa +" "+"Рубля");
        if (summa%10==4 && summa%100!=14)
            System.out.println(summa +" "+"Рубля");
        if (summa%100>=5 && summa%100<=20)
            System.out.println(summa +" "+"Рублей");
        if (summa%10==0)
            System.out.println(summa +" "+"Рублей");

    }

}
