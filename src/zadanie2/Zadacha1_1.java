package zadanie2;

import java.util.Arrays;

import static java.lang.String.join;

public class Zadacha1_1 {
    public static void main(String [] args) {

        for (String arg : args) {
            int chislo = Integer.parseInt(arg.trim());
            long result = 1;

            for (int i = 1; i <= chislo; i++) {
                result *= i;
                System.out.print(i);
                if (i < chislo) {
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + result);
        }
    }
}

//Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ