package zadanie1.zadacha5;

import java.util.Scanner;

public class Zadacha5_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Как Ваше имя?");
        String name = in.nextLine();

        switch (name) {

            case "Вася":
                System.out.println("Привет!"+"\n" +"Я тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default: System.out.println("Добрый день, а вы кто?");
        }

    }
}

