package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie5_secundi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int vvod = in.nextInt();

        int nedeli = vvod/604800;
        vvod = vvod-(nedeli*604800);
        int sutki = vvod/86400;
        vvod = vvod-(sutki*86400);
        int chasi = vvod/3600;
        vvod = vvod-(chasi*3600);
        int min = vvod/60;
        vvod = vvod-(min*60);


        System.out.println(nedeli+"week");
        System.out.println(sutki+"day");
        System.out.println(chasi+"hour");
        System.out.println(min+"minute");
        System.out.println(vvod+"second");

    }
}
