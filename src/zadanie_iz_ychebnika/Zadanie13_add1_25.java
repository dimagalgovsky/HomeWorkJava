package zadanie_iz_ychebnika;

public class Zadanie13_add1_25 {
    public static void main(String[] args) {

        long result=1;
        int i=1;
    do {
        result *=i;
        i++;
    }
    while (i<=25);
        System.out.println(result);
    }
}
