package zadanie2.zadacha1;

public class Zadacha1_5 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("");
            for (int j = 2; j < 6; j += 1) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
            }
        }
        System.out.println("");

            for (int k = 1; k < 11; k++) {
                System.out.println("");
                for (int l = 6; l < 10; l += 1) {
                    System.out.print(l + " * " + k + " = " + (k * l) + "\t\t");
                }

            }
        }
}


//1.5. Вывести таблицу умножения в консоль.
// В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
// https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0