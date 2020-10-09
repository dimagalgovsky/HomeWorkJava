package zadanie3.newVariant;

public class CalcWithMemoryMain {
    public static void main(String[] args) {

        CalcWithMathCopy calc = new CalcWithMathCopy();
        ICalculator calcMemory = calc;
        CalcWithMemory calculatorMain = new CalcWithMemory(calc);


        calculatorMain.division(28,5);
        calculatorMain.writeMemory();

        calculatorMain.power(calculatorMain.readMemory(), 2);
        calculatorMain.writeMemory();

        calculatorMain.sum(calculatorMain.readMemory(),4.1);
        calculatorMain.writeMemory();

        //System.out.println(calculatorMain.readMemory());

        calculatorMain.sum(calculatorMain.readMemory(), calculatorMain.increase(15,7));
        calculatorMain.writeMemory();

        System.out.println(calculatorMain.getResult());
    }
}
