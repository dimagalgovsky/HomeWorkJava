package zadanie2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie4_arr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер массива для сортировки: \n№1: {1,2,3,4,5,6} \n№2: {1,1,1,1} \n№3: {9,1,5,99,9,9}");
        System.out.println("№4: {} \n№5: Массив произвольной длины с произвольными данными \n№6: Ввести массив с клавиатуры");
        int num = input.nextInt();
        int[] array;

        switch (num) {
            case 1:
                array = new int[]{1, 2, 3, 4, 5, 6};
                break;
            case 2:
                array = new int[]{1, 1, 1, 1};
                break;
            case 3:
                array = new int[]{9, 1, 5, 99, 9, 9};
                break;
            case 4:
                array = new int[]{};
                break;

            case 5 :
                int a = 0; // Начальное значение диапазона - "от"
                int b = 100; // Конечное значение диапазона - "до"
                int random_number1 = a + (int) (Math.random() * b);

                array = new int[random_number1];
                Random rand = new Random();
                for (int y = 0; y <random_number1 ; y++)
                {
                    array[y] = ((int)(Math.random() * random_number1)+ random_number1);
                }
                break;

            case 6:
                System.out.println("Введите размер массива :");
                int lenght = input.nextInt();
                array = new int[lenght];

                System.out.println("Введите " + lenght + " чисел");
                for (int i = 0; i < lenght; i++) {
                    array[i] = input.nextInt();
                }
                break;

            default:
               throw new IllegalStateException("Unexpected value: " + num);    //спросить Илью
        }

        System.out.println("Выберите способ сортировки: \n№1 - пузырьковая \n№2 - шейкерная");
        int num1 = input.nextInt();

            System.out.println("массив №"+num+" перед сортировкой : " + Arrays.toString(array));

            if (num1 == 1){
                Zadanie4_sort.bubl(array);
                System.out.println("массив №"+num+" после пузырьковой сортировки : " + Arrays.toString(array));
            }
            else {
                Zadanie4_sort.sheik(array);
                System.out.println("массив №"+num+" после шейкернойсортировки : " + Arrays.toString(array));
            }
    }
}

    /*
    Выполнить сортировку массива с числами:
	4.0. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться. Дублирование кода сортировок приведёт к провалу выполнения данного задания.
	    Итогом выполнения данного задания будет МАКСИМУМ 2 класса, может быть 1.
	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
	        Для вывода можно использовать Arrays.
	4.2. Пишем следующие алгоритмы:
		4.2.1. Пузырьковая сортировка
		4.2.2. Шейкерная сортировка
	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
		4.3.1. {1,2,3,4,5,6}
		4.3.2. {1,1,1,1}
		4.3.3. {9,1,5,99,9,9}
		4.3.4. {}
	4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами
	4.5. После рандома написать код который будет создавать массив руками через консоль
     */

