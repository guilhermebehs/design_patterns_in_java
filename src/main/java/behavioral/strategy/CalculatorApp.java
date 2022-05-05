package behavioral.strategy;

public class CalculatorApp {

    public double calculate(int num1, int num2, OperationStrategy operationStrategy){
        return operationStrategy.calculate(num1, num2);
    }
}
