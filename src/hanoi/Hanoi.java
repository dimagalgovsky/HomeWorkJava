package hanoi;

import hanoi.utils.UtilsMetod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hanoi {

    public static Scanner in = new Scanner(System.in);
    static UtilsMetod utils = new UtilsMetod();

//метод вывода в печать массива
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" " + "*" + " ");
                } else {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }
    }

//метод поиска номера элемента c первым кольцом в n столбце
    public static int findNumOfColumn(int[][] arr, int num) {
        int result = 0;
        if (arr[arr.length - 1][num] == 0) {
            result = -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][num] != 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

//метод поиска последнего 0-ого элемента в n столбце
    public static int findZeroOfColumn(int[][] arr, int num){
        int result = 0;
        int i = findNumOfColumn(arr,num);
        if (i<0){
            result = arr.length-1;
        } else{
                result = i-1;
          //  if (i == 0){result = -1;} //вроде бы этого не может быть
        }
        return result;
    }

    public static void game(int sizeTower) {
//создаем и заполняем массив
        int[][] gameFrame = new int[sizeTower][3];
        boolean endGame = false;
        int count = 0;
        for (int i = 0; i < sizeTower; i++) {
            gameFrame[i][0] = i+1;
        }


        while (!endGame){
            printArray(gameFrame);
            System.out.println("\n");
            System.out.println("Выберите ход:"+"\n"+" 1. 1->2 "+" 3. 2->1 "+" 5. 3->1 "+"\n"+
                    " 2. 1->3 "+" 4. 2->3 "+" 6. 3->2 ");
            System.out.println("Если хотите завершить игру введите: 0");
            int motion = in.nextInt();

//переборка вариантов
            int outNum = 0;
            int inNum = 0;
            switch (motion){
                case 0:
                    System.exit(12);
                case 1:         //1->2
                    outNum = findNumOfColumn(gameFrame,0);   //нашли что перемещать
                    inNum = findZeroOfColumn(gameFrame,1);  //нашли куда перемещать
                    gameFrame[inNum][1] = gameFrame[outNum][0];
                    gameFrame[outNum][0] = 0;
                    count++;
                   if (utils.cheakMotion(gameFrame,0))     //сделать проверку каждого хода
                    break;
                case 2:         //1->3
                    outNum = findNumOfColumn(gameFrame,0);
                    inNum = findZeroOfColumn(gameFrame,2);
                    gameFrame[inNum][2] = gameFrame[outNum][0];
                    gameFrame[outNum][0] = 0;
                    count++;
                    break;
                case 3:       //2->1
                    outNum = findNumOfColumn(gameFrame,1);
                    inNum = findZeroOfColumn(gameFrame,0);
                    gameFrame[inNum][0] = gameFrame[outNum][1];
                    gameFrame[outNum][1] = 0;
                    count++;
                    break;
                case 4:       //2->3
                    outNum = findNumOfColumn(gameFrame,1);
                    inNum = findZeroOfColumn(gameFrame,2);
                    gameFrame[inNum][2] = gameFrame[outNum][1];
                    gameFrame[outNum][1] = 0;
                    count++;
                    break;
                case 5:       //3->1
                    outNum = findNumOfColumn(gameFrame,2);
                    inNum = findZeroOfColumn(gameFrame,0);
                    gameFrame[inNum][0] = gameFrame[outNum][2];
                    gameFrame[outNum][2] = 0;
                    count++;
                    break;
                case 6:       //3->2
                    outNum = findNumOfColumn(gameFrame,2);
                    inNum = findZeroOfColumn(gameFrame,1);
                    gameFrame[inNum][1] = gameFrame[outNum][2];
                    gameFrame[outNum][2] = 0;
                    count++;
                    break;
            }
            endGame = utils.cheakFinish(gameFrame);
            if (endGame){
                printArray(gameFrame);
                System.out.println();
            }
        }
        System.out.println("Поздравляю, игра окончена!");
        System.out.println("Количество ходов:"+count);
    }
}
