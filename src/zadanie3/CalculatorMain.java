package zadanie3;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator uslovie2 = new CalculatorWithOperator();
        double result2 = uslovie2.plus(4.1, uslovie2.plus(uslovie2.add(15,7), uslovie2.power(uslovie2.div(28,5),2)));
        double result2_1 = uslovie2.div(result2,0);
        double result2_2 = uslovie2.div(result2,0.0d);

        System.out.println("Работа с CalculatorWithOperator");
        System.out.println(result2);
        System.out.println(result2_1);
        System.out.println(result2_2);
        System.out.println();

        CalculatorWithMathCopy uslovie5 = new CalculatorWithMathCopy();
        double result5 = uslovie5.plus(4.1, uslovie5.plus(uslovie5.add(15,7), uslovie5.power(uslovie5.div(28,5),2)));
        double result5_1 = uslovie5.div(result5,0);
        double result5_2 = uslovie5.div(result5,0.0d);

        System.out.println("Работа с CalculatorWithMathCopy");
        System.out.println(result5);
        System.out.println(result5_1);
        System.out.println(result5_2);
        System.out.println();

        CalculatorWithMathExtends uslovie7 = new CalculatorWithMathExtends();
        double result7 = uslovie7.plus(4.1, uslovie7.plus(uslovie7.add(15,7), uslovie7.power(uslovie7.div(28,5),2)));
        double result7_1 = uslovie7.div(result7,0);
        double result7_2 = uslovie7.div(result7,0.0d);

        System.out.println("Работа с CalculatorWithMathExtends");
        System.out.println(result7);
        System.out.println(result7_1);
        System.out.println(result7_2);
        System.out.println();
    }
}
