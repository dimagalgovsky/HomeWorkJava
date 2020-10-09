package zadanie1.zadacha4;


import static zadanie1.zadacha4.Zadacha4.sleepIn;

public class Main {
    public static void main(String[] args) {
        boolean result = sleepIn(false, true);
        if (result) {
            System.out.println("можем спать дальше");
        } else {
            System.out.println("пора идти на работу");
        }
    }
}
