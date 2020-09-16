package zadanie3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double power(double parametr1, double parametr2) {
        return Math.pow(parametr1,parametr2);
    }

    @Override
    public double abs(double parametr1) {
        return Math.abs(parametr1);
    }

}
