package zadanie5;

public class Zadacha5 {
    public static void main(String[] args) {

        int number = 371_011_098;
        double number1 = 71_011_098.499;
        int day = 1674;

        toString(number);
        System.out.println();
        toString(number1);
        System.out.println();
        toWeek(day);
    }

     public static void toString(int number) {       //Должен быть String

         int million = number / 1_000_000;           //миллионы
         pechatSto(million);
         pechatDes(million);
         pechatEd(million);
         pechad12(million);
         printMillion(million);
         number = number - million * 1_000_000;

         int thousand = number / 1_000;              //тысячи
         pechatSto(thousand);
         pechatDes(thousand);
         pechatEd(thousand);
         pechad12Thous(thousand);
         printThousand(thousand);

         number = number - thousand * 1_000;         //единицы
         pechatSto(number);
         pechatDes(number);
         pechatEd(number);
         pechad12(number);
     }

    public static void toString(double number1){    //Должен быть String

        double drob = number1 % 1;
        double drob1 = drob * 100;
        int drob2 = (int) drob1;
        int number = (int) number1;
        toString(number);
        System.out.print("целых ");
        pechatDes(drob2);
        pechatEd(drob2);
        pechad12Thous(drob2);
        prindDouble(drob,drob2);
    }

    public static void toWeek(int day){             //Должен быть String
        day = day / 7;
        System.out.print(day+" ");
        printWeek(day);
    }

    public static void pechatSto (int chislo) {     //печатает сотни
        int sto = chislo / 100;
        switch (sto) {
            case 1:
                System.out.print("сто ");
                break;
            case 2:
                System.out.print("двести ");
                break;
            case 3:
                System.out.print("триста ");
                break;
            case 4:
                System.out.print("четыреста ");
                break;
            case 5:
                System.out.print("пятьсот ");
                break;
            case 6:
                System.out.print("шестьсот ");
                break;
            case 7:
                System.out.print("семьсот ");
                break;
            case 8:
                System.out.print("восемьсот ");
                break;
            case 9:
                System.out.print("девятьсот ");
                break;
            case 0:
                break;
            }
    }

    public static void pechatDes (int chislo) {     //печатает десятки

        int sto = chislo / 100;
        chislo = chislo - sto * 100;
        int des = chislo / 10;
        chislo = chislo - des * 10;

        switch (des) {
            case 1:
                switch (chislo) {
                    case 1:
                        System.out.print("одиннадцать ");
                        return;
                    case 2:
                        System.out.print("двенадцать ");
                        return;
                    case 3:
                        System.out.print("тринадцать ");
                        return;
                    case 4:
                        System.out.print("четырнадцать ");
                        return;
                    case 5:
                        System.out.print("пятнадцать ");
                        return;
                    case 6:
                        System.out.print("шестнадцать ");
                        return;
                    case 7:
                        System.out.print("семнадцать ");
                        return;
                    case 8:
                        System.out.print("восемнадцать ");
                        return;
                    case 9:
                        System.out.print("девятнадцать ");
                        return;
                    case 0:
                        System.out.print("десять ");
                        return;
                }
                break;
            case 2:
                System.out.print("двадцать ");
                break;
            case 3:
                System.out.print("тридцать ");
                break;
            case 4:
                System.out.print("сорок ");
                break;
            case 5:
                System.out.print("пятьдесят ");
                break;
            case 6:
                System.out.print("шестьдесят ");
                break;
            case 7:
                System.out.print("семьдесят ");
                break;
            case 8:
                System.out.print("восемьдесят ");
                break;
            case 9:
                System.out.print("девяноста ");
                break;
            case 0:
                break;
        }
    }

    public static void pechatEd (int chislo) {          //печать единицы
        if (10>(chislo % 100) || (chislo % 100)>19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 3:
                    System.out.print("три ");
                    break;
                case 4:
                    System.out.print("четыре ");
                    break;
                case 5:
                    System.out.print("пять ");
                    break;
                case 6:
                    System.out.print("шесть ");
                    break;
                case 7:
                    System.out.print("семь ");
                    break;
                case 8:
                    System.out.print("восемь ");
                    break;
                case 9:
                    System.out.print("девять ");
                    break;
                case 0:
                    break;
            }
        }
    }

    public static void pechad12(int chislo) {
        if (10>(chislo % 100) || (chislo % 100)>19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 1:
                    System.out.print("один ");
                    break;
                case 2:
                    System.out.print("два ");
                    break;
            }
        }
    }

    public static void pechad12Thous(int chislo) {
        if (10 > (chislo % 100) || (chislo % 100) > 19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 1:
                    System.out.print("одна ");
                    break;
                case 2:
                    System.out.print("две ");
                    break;
            }
        }
    }

    public static void printMillion(int chislo) {
        if (chislo > 0) {
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                System.out.print("миллион ");
                return;
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                System.out.print("миллиона ");
                return;
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                System.out.print("миллиона ");
                return;
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                System.out.print("миллиона ");
                return;
            }
            else {
                System.out.print("миллионов ");
            }
        }
    }

    public static void printThousand(int chislo) {
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                System.out.print("тысяча ");
                return;
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                System.out.print("тысячи ");
                return;
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                System.out.print("тысячи ");
                return;
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                System.out.print("тысячи ");
                return;
            } else {
                System.out.print("тысяч ");
            }

    }

    public static void prindDouble(double drob, int chislo){
        if (drob<0.1) {
            if (drob < 0.02) {
                System.out.print("сотая");
                return;
            } else {
                System.out.print("сотых");
                return;
            }
        }
        if (chislo>10){
            if (chislo%10 == 1){
                System.out.print("сотая");
            }
            else {
                System.out.print("сотых");
            }
        }
        else {
            if (chislo == 1){
                System.out.print("десятая ");
            }
            else {
                System.out.println("десятых");
            }
        }
    }

    public static void printWeek(int chislo){
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                System.out.print("неделя ");
                return;
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                System.out.print("недели ");
                return;
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                System.out.print("недели ");
                return;
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                System.out.print("недели ");
                return;
            } else {
                System.out.print("недель ");
            }
    }
}


