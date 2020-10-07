package zadanie3.newVariant;

public class CalcWithCounterInterface implements ICalculator {

    CalcWithOperator calcInt = new CalcWithOperator();

    private long count = 0;

    public long getCountOperation(){
        return count;
    }

    @Override
    public double division(double a, double b) {
        this.count++;
        return this.calcInt.division(a,b);
    }

    @Override
    public double increase(double a, double b) {
        this.count++;
        return this.calcInt.increase(a,b);
    }

    @Override
    public double sum(double a, double b) {
        this.count++;
        return this.calcInt.sum(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        this.count++;
        return this.calcInt.subtract(a,b);
    }

    @Override
    public double power(double a, int b) {
        this.count++;
        return this.calcInt.power(a,b);
    }

    @Override
    public double module(double a) {
        this.count++;
        return this.calcInt.module(a);
    }

    @Override
    public double sqrt(double a) {
        this.count++;
        return this.calcInt.sqrt(a);
    }

    public static void main(String[] args) {
        CalcWithCounterInterface calcInt = new CalcWithCounterInterface();
        double result = calcInt.sum(4.1, calcInt.sum(calcInt.increase(15, 7),calcInt.power(calcInt.division(28, 5), 2)));
        System.out.println(result);
        System.out.println(calcInt.getCountOperation());
    }
}
