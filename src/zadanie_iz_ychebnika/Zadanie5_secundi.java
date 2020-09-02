package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie5_secundi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int vvod = in.nextInt();

        int week = vvod/604800;
            vvod = vvod-(week*604800);
        int day = vvod/86400;
            vvod = vvod-(day*86400);
        int hour = vvod/3600;
            vvod = vvod-(hour*3600);
        int min = vvod/60;
            vvod = vvod-(min*60);


        System.out.println(week+" week");
        System.out.println(day+" day");
        System.out.println(hour+" hour");
        System.out.println(min+" minute");
        System.out.println(vvod+" second");

    }
}
