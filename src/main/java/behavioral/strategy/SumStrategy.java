package behavioral.strategy;

public class SumStrategy implements OperationStrategy {

    @Override
    public double calculate(int num1, int num2) {
        return num1 + num2;
    }
}
