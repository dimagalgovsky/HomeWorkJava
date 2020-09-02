package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie7_kvadratikrug {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введиет ширину прямоугольника");
        int a = in.nextInt();

        Scanner in1 = new Scanner (System.in);
        System.out.println("Введиет длину прямоугольника");
        int b = in1.nextInt();

        Scanner in2 = new Scanner (System.in);
        System.out.println("Введиет радиус круга");
        int r = in2.nextInt();

        boolean uslovie = (Math.sqrt(a*a+b*b)<=2*r);

        if (uslovie)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
