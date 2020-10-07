package zadanie3.newVariant;

public class CalcWithMathCopy implements ICalculator {
    public double division (double a, double b){
        return a/b;
    }
    public double increase (double a, double b){
        return a*b;
    }
    public double sum (double a, double b){
        return a+b;
    }
    public double subtract (double a, double b){
        return a-b;
    }

    public double power (double a, int b){
        return Math.pow(a,b);
    }
    public double module(double a){
        return Math.abs(a);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
