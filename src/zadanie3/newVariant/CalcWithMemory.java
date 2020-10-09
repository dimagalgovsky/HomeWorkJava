package zadanie3.newVariant;

public class CalcWithMemory implements ICalculator{

    double memory = 0;
    double result = 0;
    private ICalculator calcMemory;

    public CalcWithMemory(ICalculator calc) {
        this.calcMemory = calc;
    }

    public double writeMemory(){
        return this.memory=this.result;
    }

    public double getResult() {
        return this.result;
    }

    public double readMemory(){
        double valueMemory = this.memory;
        this.memory = 0d;
        return valueMemory;
    }

    public double division (double a, double b){
        return this.result=calcMemory.division(a,b);
    }
    public double increase (double a, double b){
        return this.result=calcMemory.increase(a,b);
    }
    public double sum (double a, double b){
        return this.result=calcMemory.sum(a,b);
    }
    public double subtract (double a, double b){
        return this.result=calcMemory.subtract(a,b);
    }
    public double power (double a, int b){
        return this.result=calcMemory.power(a,b);
    }
    public double module(double a){
        return this.result=calcMemory.module(a);
    }
    public double sqrt(double a) {
        return this.result=calcMemory.sqrt(a);
    }
}
