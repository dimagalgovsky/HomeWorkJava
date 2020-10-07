package zadanie3.newVariant;

public class CalcWithMemory {
    double memory = 0;

    public double memoryCalc(){
        return memory;
    }

    public double division (double a, double b){
        return memory=a/b;
    }
    public double increase (double a, double b){
        return memory=a*b;
    }
    public double sum (double a, double b){
        return memory=a+b;
    }
    public double subtract (double a, double b){
        return memory=a-b;
    }
    public double power (double a, int b){
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return memory=result;
    }
    public double module(double a){
        if (a < 0){
            a += 2*a;
        }
        return memory=a;
    }
    public double sqrt(double a) {
        double result = 0;
        while (result * result - a <= 0.01){
            result+=0.01;
        }
        return memory=result;
    }
}
