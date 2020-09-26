package zadanie_iz_ychebnika;

public class Zadanie14_sumNumber {
    public static void main(String[] args) {
        int result=0;
        long i = 7893823445l;

        do {
            result += i%10;
            i = i/10;
        } while (i>0);
        System.out.println(result);
    }
}
