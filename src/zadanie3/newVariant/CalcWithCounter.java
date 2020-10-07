package zadanie3.newVariant;

public class CalcWithCounter implements ICalculator {

    CalcWithOperator calc1 = new CalcWithOperator();
    CalcWithMathCopy calc2 = new CalcWithMathCopy();
    CalcWithMathExtends calc3 = new CalcWithMathExtends();

    private long count = 0;

    public long getCountOperation(){
        return count;
    }

    public double division (double a, double b){
        count++;
        return a/b;
    }
    public double increase (double a, double b){
        count++;
        return a*b;
    }
    public double sum (double a, double b){
        count++;
        return a+b;
    }
    public double subtract (double a, double b){
        count++;
        return a-b;
    }
    public double power (double a, int b){
        count++;
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    public double module(double a){
        count++;
        if (a < 0){
            a += 2*a;
        }
        return a;
    }
    public double sqrt(double a) {
        count++;
        double result = 0;
        while (result * result - a <= 0.01){
            result+=0.01;
        }
        return result;
    }
}
