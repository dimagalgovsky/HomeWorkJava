package zadanie1.zadacha5;

import java.util.Objects;
import java.util.Scanner;

public class Zadacha5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Как Ваше имя?");
        String name = in.nextLine();

        if (Objects.equals(name, "Вася")) {
                System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
        };

        if (Objects.equals(name, "Анастасия")) {
                System.out.println("Я тебя так долго ждал");
        }

        if ((!Objects.equals(name, "Анастасия")) && (!Objects.equals(name, "Вася"))) {
                System.out.println("Добрый день, а вы кто?");
        }
    }
}

