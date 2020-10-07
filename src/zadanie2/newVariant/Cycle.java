package zadanie2.newVariant;

import java.util.Scanner;

public class Cycle {

//1.1
    public static void factorial_1_1(int arg) {
        long result = 1;
        for (int i = 1; i <= arg; i++) {
            result *= i;
            System.out.print(i);
            if (i < arg) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + result);
    }

//1.2
    public static void factorial_1_2(int arg){

        int result = 1;
        int dlina = (int) Math.log10(arg)+1;
        int[] arr = new int[dlina];

        for (int i = 0; i < dlina; i++) {
            arr[i] = arg % 10;
            arg = arg / 10;
        }

        for (int i = dlina-1; i >= 0; i--) {
            result *= arr[i];
            System.out.print(arr[i]);
            if ( i > 0 ) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = "+result);
    }

//1.3
    public static void pow_1_3(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        double arg = in.nextDouble();
        int pow = in.nextInt();
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *= arg;
        }
        System.out.println(result);
    }

//1.4
    public static void longA_1_4(long arg) {
        long stop = 9223372036854775807l;

        while (arg < stop/3){
            arg *= 3;
        }
        System.out.println(arg+" - до переполнения");
        System.out.printf(3*arg+" - после переполнения");
    }

//1.5
    public static void calc_1_5(){
        for (int i = 1; i < 11; i++) {
        System.out.println("");
        for (int j = 2; j < 6; j += 1) {
            System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
        }
    }
        System.out.println("");

            for (int k = 1; k < 11; k++) {
                System.out.println("");
                for (int l = 6; l < 10; l += 1) {
                    System.out.print(l + " * " + k + " = " + (k * l) + "\t\t");
                }
            }
    }
}
