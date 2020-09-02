package zadanie_iz_ychebnika;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9_data {
    public static void main(String[] args){

//ввод данных


        //сделать проверку на 31 число и месяц


        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
        int den = in.nextInt();
            // проверка данных
             if ((den>31) || (den==0)){
                 System.out.println("Ввели некоректное число");
                 System.exit(0);
             }

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите месяц");
        int mes = in1.nextInt();
            // проверка данных
            if ((mes>12) || (mes==0)) {
                System.out.println("Ввели некоректное число");
                System.exit(0);
            }

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите год");
        int god = in2.nextInt();
            // проверка данных
            if (god/1000<1) {
                    System.out.println("Ввели некоректное число");
                    System.exit(0);
                     }

        if ((den>=1) && (den<=27)) {
            den += 1;
            System.out.println(den+"."+mes+"."+god);
            System.exit(0);}

        switch (mes) {
            /*
            case1:
            case2:
            if

             */
            case 1:
                if (den==31){
                    den=1;
                    mes=2;
                    break;
                }
                else den+=1;

            case 3:
                if (den==31){
                    den=1;
                    mes=4;
                    break;
                }
                else den+=1;

            case 5:
                if (den==31){
                    den=1;
                    mes=6;
                    break;
                }
                else den+=1;

            case 7:
                if (den==31){
                    den=1;
                    mes=8;
                    break;
                }
                else den+=1;

            case 8:
                if (den==31){
                    den=1;
                    mes=9;
                    break;
                }
                else den+=1;

            case 10:
                if (den==31){
                    den=1;
                    mes=11;
                    break;
                }
                else den+=1;

            case 12:
                if (den==31){
                    den=1;
                    mes=1;
                    god=god+1;
                    break;
                }
                else den+=1;

            case 4:
                if (den==30){
                    den=1;
                    mes=5;
                    break;
                }

            case 6:
                if (den==30){
                    den=1;
                    mes=7;
                    break;
                }
                else den+=1;

            case 9:
                if (den==30){
                    den=1;
                    mes=10;
                    break;
                }
                else den+=1;

            case 11:
                if (den==30){
                    den=1;
                    mes=12;
                    break;
                }
                else den+=1;

            case 2:
                if(god%4==0 && god%100 !=0 || god%400==0) {
                    switch (den) {
                        case 29:
                            den = 1;
                            mes = 3;
                            break;
                        case 28:
                            den += 1;
                            mes = 2;
                            break;
                    }
                }
                else
                    den+=1;

        }
        System.out.println(den+"."+mes+"."+god);

    }
}
