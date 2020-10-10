package zadanie5;

public class Zadacha5 {
    public static void main(String[] args) {

        int number = -287568723;
        System.out.println(toString(number));

        double number1 = 11.28;
        System.out.println(toString(number1));

        int day = 1674;
        System.out.println(toWeek(day));

        long millisecond = 10054565001l;
        boolean shortFormat = false;
        System.out.println(toHoursMinuteSecondMillisecond(millisecond,shortFormat));
    }

     public static String toString(int number) {
        String result = "";
        if (number==0){
            return "ноль ";
        }
        if (number<0) {
            result += "минус ";
            number = Math.abs(number);
        }
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

        if (number1<0) {
            result += "минус ";
            number1 = Math.abs(number1);
        }

        double drob = number1 % 1;
        double drob1 = drob * 100;
        int drob2 = (int)Math.abs(drob1);
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

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        String result = "";
        long hh, mm, ss, sss = 0;

        hh = millisecond/3600000;
        millisecond -= hh*3600000;
        mm = millisecond/60000;
        millisecond -= mm*60000;
        ss = millisecond/1000;
        millisecond -= ss*1000;
        sss = millisecond;

        if (shortFormat) {
            //result += mm+":"+ss+"."+sss;
            result += timeFormat(hh) + hh + ":";
            result += timeFormat(mm) + mm + ":";
            result += timeFormat(ss) + ss + ".";
            result += timeFormatSSS(sss) + sss;
        }
        else {
            result += hh + printHour(hh);
            result += mm + printMin(mm);
            result += ss + printSec(ss);
            result += sss + printMilSec(sss);
        }
        return result;
    }

    public static String timeFormat(long a){
        String result = "";
        if (a<10){
            result +="0";
        }
        return result;
    }

    public static String timeFormatSSS(long a){
        String result = "";
        if (a<10){
            result ="00";
        }
        if (a>=10 && a<100){
            result ="0";
        }
        return result;
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

        if (drob<=0.1) {
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

    public static String printHour(long hh){
        if (hh % 10 == 1 && hh % 100 != 11) {
            return " час ";
        }
        if (hh % 10 == 2 && hh % 100 != 12) {
            return " часа ";
        }
        if (hh % 10 == 3 && hh % 100 != 13) {
            return " часа ";
        }
        if (hh % 10 == 4 && hh % 100 != 14) {
            return " часа ";
        } else {
            return " часов ";
        }
    }

    public static String printMin(long mm){
        if (mm % 10 == 1 && mm % 100 != 11) {
            return " минута ";
        }
        if (mm % 10 == 2 && mm % 100 != 12) {
            return " минуты ";
        }
        if (mm % 10 == 3 && mm % 100 != 13) {
            return " минуты ";
        }
        if (mm % 10 == 4 && mm % 100 != 14) {
            return " минуты ";
        } else {
            return " минут ";
        }
    }

    public static String printSec(long ss){
        if (ss % 10 == 1 && ss % 100 != 11) {
            return " секунда ";
        }
        if (ss % 10 == 2 && ss % 100 != 12) {
            return " секунды ";
        }
        if (ss % 10 == 3 && ss % 100 != 13) {
            return " секунды ";
        }
        if (ss % 10 == 4 && ss % 100 != 14) {
            return " секунды ";
        } else {
            return " секунд ";
        }
    }

    public static String printMilSec(long sss){
        if (sss % 10 == 1 && sss % 100 != 11) {
            return " миллисекунда ";
        }
        if (sss % 10 == 2 && sss % 100 != 12) {
            return " миллисекунды ";
        }
        if (sss % 10 == 3 && sss % 100 != 13) {
            return " миллисекунды ";
        }
        if (sss % 10 == 4 && sss % 100 != 14) {
            return " миллисекунды ";
        } else {
            return " миллисекунд ";
        }
    }

}