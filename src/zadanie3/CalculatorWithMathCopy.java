package zadanie3;

public class CalculatorWithMathCopy {

    public double div(double parametr1, double parametr2) {
        return parametr1 / parametr2;
    }

    public double add(double parametr1, double parametr2) {
        return parametr1 * parametr2;
    }

    public double minus(double parametr1, double parametr2) {
        return parametr1 - parametr2;
    }

    public double plus(double parametr1, double parametr2) {
        return parametr1 + parametr2;
    }

    public double abs(double parametr1) {
        return Math.abs(parametr1);
    }

    public double power(double parametr1, double parametr2){
        return Math.pow(parametr1,parametr2);
    }

    public double sqrt(double parametr1){
        return Math.sqrt(parametr1);
    }
}
