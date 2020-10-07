package zadanie3.newVariant;

public class CalcWithMathExtends extends CalcWithOperator implements ICalculator{

    @Override
    public double power(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double module(double a) {
        return Math.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
