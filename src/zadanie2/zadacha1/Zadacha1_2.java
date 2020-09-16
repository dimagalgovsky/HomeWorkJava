package zadanie2.zadacha1;

public class Zadacha1_2 {
    public static void main(String[] args) {
        for (String arg : args) {

            int dlina = arg.length();
            int chislo = Integer.parseInt(arg.trim());
            int[] arr = new int[dlina];
            long result = 1;

            for (int i = 0; i < dlina; i++) {
                arr[i] = chislo % 10;
                chislo = chislo / 10;
            }

            for (int i = (dlina - 1); i >= 0; i--) {
                result *= arr[i];
                System.out.print(arr[i]);
                if (i > 0) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + result);
        }
    }
}

//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
//Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * …. * 5 = ответ