package zadanie1.zadacha4;

public class Zadacha4 {
    public static boolean sleepIn(boolean weekday, boolean vacation){

        if (!weekday || vacation){
            System.out.println("можем спать дальше");
            return true;
        }
        else {
            System.out.println("пора идти на работу");
            return false;
        }
    }
}
