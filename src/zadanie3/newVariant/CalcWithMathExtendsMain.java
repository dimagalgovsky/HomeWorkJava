package zadanie3.newVariant;

public class CalcWithMathExtendsMain {
    public static void main(String[] args) {

        CalcWithMathExtends calc2Ext = new CalcWithMathExtends();
        double result = calc2Ext.sum(4.1, calc2Ext.sum(calc2Ext.increase(15, 7),calc2Ext.power(calc2Ext.division(28, 5), 2)));
        System.out.println(result);
    }
}
