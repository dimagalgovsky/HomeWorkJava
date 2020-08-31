package zadanie_iz_ychebnika;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie4_vvod_chisel {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int chislo1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        int chislo2 = in2.nextInt();

        int result = (chislo1 + chislo2) + (chislo1 * chislo2);

        System.out.println(result);

    }
}
