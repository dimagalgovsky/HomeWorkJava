package zadanie3.newVariant;

public class CalcWithOperator implements ICalculator {

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
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    public double module(double a){
        if (a < 0){
            a += 2*a;
        }
        return a;
    }
    public double sqrt(double a) {
        double result = 0;
        while (result * result - a <= 0.01){
          result+=0.01;
        }
        return result;
    }
}
