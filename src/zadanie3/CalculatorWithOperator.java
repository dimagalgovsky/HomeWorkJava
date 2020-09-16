package zadanie3;

public class CalculatorWithOperator {


    public double div ( double parametr1, double parametr2){
        return parametr1 / parametr2;
    }

    public double add (double parametr1, double parametr2){
        return parametr1 * parametr2;
    }

    public double minus (double parametr1, double parametr2){
        return parametr1 - parametr2;
    }

    public double plus (double parametr1, double parametr2){
        return parametr1 + parametr2;
    }

    public double power (double parametr1, double parametr2){
        double result = 1;
        for (int i = 1; i <= parametr2; i++) {
            result *=parametr1;
        }
        return result;
    }

    public double abs (double parametr1){

        return parametr1 > 0 ? parametr1 : -parametr1;
    }
}
