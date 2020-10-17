package hanoi;

import hanoi.utils.UtilsMetod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hanoi {

    public static Scanner in = new Scanner(System.in);
    static UtilsMetod utils = new UtilsMetod();

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
        }
        return result;
    }

//игра
    public static void game(int sizeTower) {
//создаем и заполняем массив
        int[][] gameFrame = new int[sizeTower][3];
        boolean endGame = false;
        int count = 0;
        for (int i = 0; i < sizeTower; i++) {
            gameFrame[i][0] = i+1;
        }

        while (!endGame){
            utils.printArray(gameFrame);
            System.out.println("Выберите ход:"+"\n"+" 1. 1->2 "+" 3. 2->1 "+" 5. 3->1 "+"\n"+
                    " 2. 1->3 "+" 4. 2->3 "+" 6. 3->2 ");
            System.out.println();
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
                    if (utils.cheakMotion(gameFrame,outNum,inNum,0,1)) {
                        gameFrame[inNum][1] = gameFrame[outNum][0];
                        gameFrame[outNum][0] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
                case 2:         //1->3
                    outNum = findNumOfColumn(gameFrame,0);
                    inNum = findZeroOfColumn(gameFrame,2);
                    if (utils.cheakMotion(gameFrame,outNum,inNum,0,2)) {
                        gameFrame[inNum][2] = gameFrame[outNum][0];
                        gameFrame[outNum][0] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
                case 3:       //2->1
                    outNum = findNumOfColumn(gameFrame,1);
                    inNum = findZeroOfColumn(gameFrame,0);
                    if (utils.cheakMotion(gameFrame,outNum,inNum,1,0)) {
                        gameFrame[inNum][0] = gameFrame[outNum][1];
                        gameFrame[outNum][1] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
                case 4:       //2->3
                    outNum = findNumOfColumn(gameFrame,1);
                    inNum = findZeroOfColumn(gameFrame,2);
                    if (utils.cheakMotion(gameFrame,outNum,inNum,1,2)) {
                        gameFrame[inNum][2] = gameFrame[outNum][1];
                        gameFrame[outNum][1] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
                case 5:       //3->1
                    outNum = findNumOfColumn(gameFrame,2);
                    inNum = findZeroOfColumn(gameFrame,0);
                    if (utils.cheakMotion(gameFrame,outNum,inNum,2,0)) {
                        gameFrame[inNum][0] = gameFrame[outNum][2];
                        gameFrame[outNum][2] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
                case 6:       //3->2
                    outNum = findNumOfColumn(gameFrame,2);
                    inNum = findZeroOfColumn(gameFrame,1);
                    if (utils.cheakMotion(gameFrame,outNum,inNum,2,1)) {
                        gameFrame[inNum][1] = gameFrame[outNum][2];
                        gameFrame[outNum][2] = 0;
                    }
                    else {
                        System.out.println("Ход нельзя выполнить, повторите попытку");
                    }
                    count++;
                    break;
            }
            endGame = utils.cheakFinish(gameFrame);
            if (endGame){
                utils.printArray(gameFrame);
                System.out.println();
            }
        }
        System.out.println("Поздравляю, игра окончена!");
        System.out.println("Количество ходов:"+count);
    }
}
