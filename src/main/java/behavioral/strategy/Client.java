package behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        var calculatorApp = new CalculatorApp();

        System.out.println( calculatorApp.calculate(2, 1, new SumStrategy()));
        System.out.println(calculatorApp.calculate(2, 1, new SubtractionStrategy()));

    }
}
