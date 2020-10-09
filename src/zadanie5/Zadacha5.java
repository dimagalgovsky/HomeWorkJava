package zadanie5;

public class Zadacha5 {
    public static void main(String[] args) {

        int number = 12_098;
        double number1 = 1233323.4;
        int day = 1674;

        System.out.println(toString(number));
        System.out.println(toString(number1));
        System.out.println(toWeek(day));
    }

     public static String toString(int number) {
         String result = "";

         int million = number / 1_000_000;
         if (million > 0) {
             result += pechatSto(million);
             result += pechatDes(million);
             result += pechatEd(million);
             result += pechad12(million);
             result += printMillion(million);
             number = number - million * 1_000_000;
         }

         int thousand = number / 1_000;
         if (thousand > 0) {
             result += pechatSto(thousand);
             result += pechatDes(thousand);
             result += pechatEd(thousand);
             result += pechad12Thous(thousand);
             result += printThousand(thousand);
             number = number - thousand * 1_000;
         }

         if (number > 0) {
             result += pechatSto(number);
             result += pechatDes(number);
             result += pechatEd(number);
             result += pechad12(number);
         }
         return result.substring(0, 1).toUpperCase() + result.substring(1);
    }

    public static String toString(double number1){
        String result = "";

        double drob = number1 % 1;
        double drob1 = drob * 100;
        int drob2 = (int) drob1;
        int number = (int) number1;

        result += toString(number);
        result += "целых ";
        result += pechatDes(drob2);
        result += pechatEd(drob2);
        result += pechad12Thous(drob2);
        result += prindDouble(drob,drob2);
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }

    public static String toWeek(int day){
        String result = "";

        day = day / 7;
        result += day+" ";
        result += printWeek(day);
        return result.substring(0, 1).toUpperCase() + result.substring(1);
        }

    public static String pechatSto (int chislo) {     //печатает сотни
        String result = "";
        int sto = chislo / 100;
        switch (sto) {
            case 1:
                return result = "сто ";
            case 2:
                return "двести ";
            case 3:
                return "триста ";
            case 4:
                return "четыреста ";
            case 5:
                return "пятьсот ";
            case 6:
                return "шестьсот ";
            case 7:
                return "семьсот ";
            case 8:
                return "восемьсот ";
            case 9:
                return "девятьсот ";
            }
            return result;
    }

    public static String pechatDes (int chislo) {     //печатает десятки

        String result = "";
        int sto = chislo / 100;
        chislo = chislo - sto * 100;
        int des = chislo / 10;
        chislo = chislo - des * 10;

        switch (des) {
            case 1:
                switch (chislo) {
                    case 1:
                        return "одиннадцать ";
                    case 2:
                        return "двенадцать ";
                    case 3:
                        return "тринадцать ";
                    case 4:
                        return "четырнадцать ";
                    case 5:
                        return "пятнадцать ";
                    case 6:
                        return "шестнадцать ";
                    case 7:
                        return "семнадцать ";
                    case 8:
                        return "восемнадцать ";
                    case 9:
                        return "девятнадцать ";
                    case 0:
                        return "десять ";
                }
            case 2:
                return "двадцать ";
            case 3:
                return "тридцать ";
            case 4:
                return "сорок ";
            case 5:
                return "пятьдесят ";
            case 6:
                return "шестьдесят ";
            case 7:
                return "семьдесят ";
            case 8:
                return "восемьдесят ";
            case 9:
                return "девяноста ";
        }
        return result;
    }

    public static String pechatEd (int chislo) {          //печать единицы
        String result = "";
        if (10>(chislo % 100) || (chislo % 100)>19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 3:
                    return "три ";
                case 4:
                    return "четыре ";
                case 5:
                    return "пять ";
                case 6:
                    return "шесть ";
                case 7:
                    return "семь ";
                case 8:
                    return "восемь ";
                case 9:
                    return "девять ";
            }
        }
        return result;
    }

    public static String pechad12(int chislo) {
        String result = "";
        if (10>(chislo % 100) || (chislo % 100)>19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 1:
                    return "один ";
                case 2:
                    return "два ";
            }
        }
        return result;
    }

    public static String pechad12Thous(int chislo) {
        String result = "";
        if (10 > (chislo % 100) || (chislo % 100) > 19) {
            chislo = chislo % 10;
            switch (chislo) {
                case 1:
                    return "одна ";
                case 2:
                    return "две ";
            }
        }
        return result;
    }

    public static String printMillion(int chislo) {
        String result = "";
        if (chislo > 0) {
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                return "миллион ";
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                return "миллиона ";
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                return "миллиона ";
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                return "миллиона ";
            }
            else {
                return "миллионов ";
            }
        }
        return result;
    }

    public static String printThousand(int chislo) {
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                return "тысяча ";
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                return "тысячи ";
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                return "тысячи ";
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                return "тысячи ";
            } else {
                return "тысяч ";
            }
    }

    public static String prindDouble(double drob, int chislo){
        if (drob<0.1) {
            if (drob < 0.02) {
                return "сотая ";
            } else {
                return "сотых ";
            }
        }
        if (chislo>10){
            if (chislo%10 == 1){
                return "сотая ";
            }
            else {
                return "сотых ";
            }
        }
        else {
            if (chislo == 1){
                return "десятая ";
            }
            else {
                return "десятых ";
            }
        }
    }

    public static String printWeek(int chislo){
            if (chislo % 10 == 1 && chislo % 100 != 11) {
                return "неделя ";
            }
            if (chislo % 10 == 2 && chislo % 100 != 12) {
                return "недели ";
            }
            if (chislo % 10 == 3 && chislo % 100 != 13) {
                return "недели ";
            }
            if (chislo % 10 == 4 && chislo % 100 != 14) {
                return "недели ";
            } else {
                return "недель ";
            }
    }
}