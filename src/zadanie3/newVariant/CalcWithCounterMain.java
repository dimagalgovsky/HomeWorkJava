package zadanie3.newVariant;

public class CalcWithCounterMain {
    public static void main(String[] args) {

        CalcWithCounter calcCounter = new CalcWithCounter();
        double result = calcCounter.sum(4.1, calcCounter.sum(calcCounter.increase(15, 7),calcCounter.power(calcCounter.division(28, 5), 2)));
        System.out.println(result);
        System.out.println(calcCounter.getCountOperation());
    }
}
