package zadanie3.newVariant;

import zadanie3.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator{
    public CalculatorWithMemoryDecorator calculator1;
 //  ICalculator icalc = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

 //  public ICalculator getCalculator(){

 //      return ICalculator;
 //  }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double increase(double a, double b) {
        return 0;
    }

    @Override
    public double sum(double a, double b) {
        return 0;
    }

    @Override
    public double subtract(double a, double b) {
        return 0;
    }

    @Override
    public double power(double a, int b) {
        return 0;
    }

    @Override
    public double module(double a) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        return 0;
    }
}
