package zadanie3.newVariant;

public class CalcWithMemoryMain {
    public static void main(String[] args) {
        CalcWithMemory calcMem = new CalcWithMemory();
        System.out.println(calcMem.sum(4.1,calcMem.sum(calcMem.increase(15,7),calcMem.power(calcMem.division(28,5),2))));
        System.out.println(calcMem.memoryCalc());
    }
}
