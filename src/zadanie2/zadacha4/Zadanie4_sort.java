package zadanie2.zadacha4;

import java.util.Arrays;

public class Zadanie4_sort {
    public static void bubl(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void sheik(int array[]) {
        int left = 0;
        int right = array.length - 1;

        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++;
        } while (left <= right);
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


/*
/Вадима
static int[] shakerSort(int[] inputArray) {
        int temp = 0;
        int leftBorder = 0;
        int rightBorder = inputArray.length - 1;
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < rightBorder; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    isSorted = false;
                }
            }
            rightBorder--;
            for (int i = rightBorder; i > leftBorder; i--) {
                if (inputArray[i] < inputArray[i + 1]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i - 1];
                    inputArray[i - 1] = temp;
                    isSorted = false;
                }
            }
            leftBorder++;
        }
        return inputArray;
    }
 */
