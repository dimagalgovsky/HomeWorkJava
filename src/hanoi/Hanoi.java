package hanoi;

import hanoi.utils.UtilsMetod;
import java.util.Scanner;

public class Hanoi {

    public static Scanner in = new Scanner(System.in);
    static UtilsMetod utils = new UtilsMetod();
    public static int count = 0;

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

public static void action(int[][] gameFrame,int column1, int column2) {
    int outNum = findNumOfColumn(gameFrame, column1);   //нашли что перемещать
    int inNum = findZeroOfColumn(gameFrame, column2);  //нашли куда перемещать

    if (utils.cheakMotion(gameFrame, outNum, inNum, column1, column2)) {
        gameFrame[inNum][column2] = gameFrame[outNum][column1];
        gameFrame[outNum][column1] = 0;
    } else {
        System.out.println("Ход нельзя выполнить, повторите попытку");
    }
}

//что делать по действиям
    public static void actionMotion(int[][] gameFrame,int motion){
        count++;

        switch (motion){
            case 0:
                System.exit(12);
            case 1:         //1->2
                action(gameFrame,0,1);
                break;
            case 2:         //1->3
                action(gameFrame,0,2);
                break;
            case 3:       //2->1
               action(gameFrame,1,0);
                break;
            case 4:       //2->3
                action(gameFrame,1,2);
                break;
            case 5:       //3->1
                action(gameFrame,2,0);
                break;
            case 6:       //3->2
                action(gameFrame,2,1);
                break;
        }
    }

//игра
    public static void gameHand(int sizeTower) {
//создаем и заполняем массив
        int[][] gameFrame = new int[sizeTower][3];
        boolean endGame = false;
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

            actionMotion(gameFrame,motion);

            endGame = utils.cheakFinish(gameFrame);
            if (endGame){
                utils.printArray(gameFrame);
                System.out.println();
            }
        }
        System.out.println("Поздравляю, игра окончена!");
        System.out.println("Количество ходов:"+count);
    }

//автоматический режим игры
    public static void gameAuto(int sizeTower){
        int[][] gameFrame = new int[sizeTower][3];
        boolean endGame = false;
        for (int i = 0; i < sizeTower; i++) {
            gameFrame[i][0] = i+1;
        }
        switch (sizeTower){
            case 3:
                int[] motion3 = new int[]{2,1,6,2,3,4,2};
                for (int i = 0; i < motion3.length; i++) {
                    utils.printArray(gameFrame);
                    actionMotion(gameFrame,motion3[i]);
                }
                break;
            case 4:
                int[] motion4 = new int[]{1,2,4,1,5,6,1,2,4,3,5,4,1,2,4};

                for (int i = 0; i < motion4.length; i++) {
                    utils.printArray(gameFrame);
                    actionMotion(gameFrame,motion4[i]);
                }
                break;
           case 5:
               int[] motion5 = new int[]{2,1,6,2,3,4,2,1,6,5,3,6,2,1,6,2,3,4,2,3,6,5,3,4,2,1,6,2,3,4,2};
               for (int i = 0; i < motion5.length; i++) {
                   utils.printArray(gameFrame);
                   actionMotion(gameFrame,motion5[i]);
               }
               break;
           case 6:
               int[] motion6 = new int[]{1,2,4,1,5,6,1,2,4,3,5,4,1,2,4,1,5,6,1,5,4,3,5,6,1,2,4,1,5,6,1,2,
                       4,3,5,4,1,2,4,3,5,6,1,5,4,3,5,4,1,2,4,1,5,6,1,2,4,3,5,4,1,2,4};
               for (int i = 0; i < motion6.length; i++) {
                   utils.printArray(gameFrame);
                   actionMotion(gameFrame,motion6[i]);
               }
               break;
      //     case 7:
      //         int[] motion7 = new int[]{0};                        ///
      //         for (int i = 0; i < motion7.length; i++) {
      //             utils.printArray(gameFrame);
      //             actionMotion(gameFrame,motion7[i]);
      //         }
      //         break;
      //     case 8:
      //         int[] motion8 = new int[]{0};                        ///
      //         for (int i = 0; i < motion8.length; i++) {
      //             utils.printArray(gameFrame);
      //             actionMotion(gameFrame,motion8[i]);
      //         }
      //         break;
        }
        utils.printArray(gameFrame);
        System.out.println("Поздравляю, игра окончена!");
        System.out.println("Количество ходов:"+count);
    }
}
