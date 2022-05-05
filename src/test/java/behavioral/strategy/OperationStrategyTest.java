package behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("OperationStrategy")
public class OperationStrategyTest {

    private CalculatorApp calculatorApp;

    @BeforeEach
    public void setUp(){
        calculatorApp = new CalculatorApp();
    }

    @Test
    @DisplayName("should add up two numbers")
    public void shouldAddUpTwoNumbers(){
        var result = calculatorApp.calculate(2, 1, new SumStrategy());
        assertEquals(result, 3);
    }

    @Test
    @DisplayName("should subtract two numbers")
    public void shouldSubtractTwoNumbers(){
        var result = calculatorApp.calculate(2, 1, new SubtractionStrategy());
        assertEquals(result, 1);
    }
}

