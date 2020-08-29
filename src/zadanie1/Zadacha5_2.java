package zadanie1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Zadacha5_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Как Ваше имя?");
        String name = in.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!"+"\n" +"Я тебя так долго ждал");
        }
        else

            if (Objects.equals(name, "Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            }
            else
                System.out.println("Добрый день, а вы кто?");

    }
}

