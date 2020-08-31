package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie6_if {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = in.nextInt();

        if (chislo%10==7)
            System.out.println("True");         //по заданию вернуть boolean значение
        else
            System.out.println("False");
    }
}
