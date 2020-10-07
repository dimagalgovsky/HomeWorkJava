package zadanie3.newVariant;

public class CalcWithMathCopyMain {

    public static void main(String[] args) {

        CalcWithMathCopy calcCopy = new CalcWithMathCopy();
        double result = calcCopy.sum(4.1, calcCopy.sum(calcCopy.increase(15, 7),calcCopy.power(calcCopy.division(28, 5), 2)));
        System.out.println(result);
    }
}

