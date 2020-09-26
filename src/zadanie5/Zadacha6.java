package zadanie5;

import java.util.Scanner;

public class Zadacha6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();

        int million = number / 1_000_000;           //миллионы
        pechat(million);
        if (million > 0) {
            System.out.print("Миллионов ");
        }

        number = number - million * 1_000_000;

        int thousand = number / 1_000;              //тысячи
        pechat(thousand);
        if (thousand>0) {
         
           if (thousand%10==1 && thousand%100!=11) {
               System.out.println("Тысяча");
               return;
            }
            if (thousand%10==2 && thousand%100!=12) {
                System.out.println("Тысячи");
            }
            if (thousand%10==3 && thousand%100!=13) {
                System.out.println("Тысяча");
            }
            if (thousand%10==4 && thousand%100!=14) {
                System.out.println("Тысячи");
            }
            else
                System.out.println("Тысяч");

        }

        number = number - thousand * 1_000;         //единицы
        pechat(number);

    }

    public static void pechat(int chislo) {

        int sto = chislo / 100;                     //сотни
        chislo = chislo - sto * 100;
        int des = chislo / 10;                      //десятки
        chislo = chislo - des * 10;                 //единицы

        switch (sto) {
            case 1:
                System.out.print("Сто ");
                break;
            case 2:
                System.out.print("Двести ");
                break;
            case 3:
                System.out.print("Триста ");
                break;
            case 4:
                System.out.print("Четыреста ");
                break;
            case 5:
                System.out.print("Пятьсот ");
                break;
            case 6:
                System.out.print("Шестьсот ");
                break;
            case 7:
                System.out.print("Семьсот ");
                break;
            case 8:
                System.out.print("Восемьсот ");
                break;
            case 9:
                System.out.print("Девятьсот ");
                break;
            case 0:
                break;
        }

        switch (des) {
            case 1:
                switch (chislo){
                    case 1:
                        System.out.print("Одиннадцать ");
                        return;
                    case 2:
                        System.out.print("Двенадцать ");
                        return;
                    case 3:
                        System.out.print("Тринадцать ");
                        return;
                    case 4:
                        System.out.print("Четырнадцать ");
                        return;
                    case 5:
                        System.out.print("Пятнадцать ");
                        return;
                    case 6:
                        System.out.print("Шестнадцать ");
                        return;
                    case 7:
                        System.out.print("Семнадцать ");
                        return;
                    case 8:
                        System.out.print("Восемнадцать ");
                        return;
                    case 9:
                        System.out.print("Девятнадцать ");
                        return;
                    case 0:
                        System.out.print("Десять ");
                        return;
                }

                break;
            case 2:
                System.out.print("Двадцать ");
                break;
            case 3:
                System.out.print("Тридцать ");
                break;
            case 4:
                System.out.print("Сорок ");
                break;
            case 5:
                System.out.print("Пятьдесят ");
                break;
            case 6:
                System.out.print("Шестьдесят ");
                break;
            case 7:
                System.out.print("Семьдесят ");
                break;
            case 8:
                System.out.print("Восемьдесят ");
                break;
            case 9:
                System.out.print("Девяноста ");
                break;
            case 0:
                break;
        }

        switch (chislo) {
            case 1:
                System.out.print("Один ");
                break;
            case 2:
                System.out.print("Два ");
                break;
            case 3:
                System.out.print("Три ");
                break;
            case 4:
                System.out.print("Четыре ");
                break;
            case 5:
                System.out.print("Пять ");
                break;
            case 6:
                System.out.print("Шесть ");
                break;
            case 7:
                System.out.print("Семь ");
                break;
            case 8:
                System.out.print("Восемь ");
                break;
            case 9:
                System.out.print("Девять ");
                break;
            case 0:
                break;
        }
    }
}



