package zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie4_arr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер массива для сортировки:");
        System.out.println("№1: {1,2,3,4,5,6}");
        System.out.println("№2: {1,1,1,1}");
        System.out.println("№3: {9,1,5,99,9,9}");
        System.out.println("№4: {}");
        System.out.println("№5: Массив произвольной длины с произвольными данными");
        System.out.println("№6: Ввести массив с клавиатуры");
        int num = input.nextInt();
        //int[] array;

     //  switch (num) {
     //      case 1:
     //          int[] array = new int[]{1, 2, 3, 4, 5, 6};
     //          break;
     //     case 2:
     //         int[] array = new int[]{1, 1, 1, 1};
     //         break;
     //     case 3:
     //         int[] array = {9, 1, 5, 99, 9, 9};
     //         break;
     //     case 4:
     //         int[] array = {};
     //         break;




       //    System.out.println("массив №"+num+"  перед пузырьковой сортировкой : " + Arrays.toString(array));
            /
            //  Zadanie4_sort.bubl(array3);
            //  System.out.println("массив №"+num+"  после пузырьковой сортировкой : " + Arrays.toString(array3));

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


     int[] arr=[]
     sort
     sout

     1 класс-запус работы 43 44 45
     2 класс 42

     1 класс сортировки
     1 класс все остальное

     */

