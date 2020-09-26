package zadanie_iz_ychebnika;

public class Zadanie12_faktorial {
    public static void main(String[] args) {

        int i=0;
        int result;
        int j=1;

        while (i<=10){
            if (i<=1) {
                result = i;
            }
            else {
                result = 1;
            }

            while (j<=i) {
                result *= j;
                j++;
            }
            j=1;
            System.out.println("Факториал "+ i+" = "+ result);
        i++;
        }
    }
}
