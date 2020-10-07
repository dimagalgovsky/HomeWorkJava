package zadanie3.newVariant;

public class CalcWithOperatorMain {

   public static void main(String[] args) {
       CalcWithOperator calc = new CalcWithOperator();
       double result = calc.sum(4.1,calc.sum(calc.increase(15,7),calc.power(calc.division(28,5),2)));
       System.out.println(result);
   }
}
