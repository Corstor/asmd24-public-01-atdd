package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void acceptanceTest(){
        Calculator calculator = new Calculator();
        calculator.enter(5);
        assertEquals(5, calculator.getResult());

        calculator.enter(6);
        calculator.add();
        assertEquals(11, calculator.getResult());

        calculator.enter(3);
        calculator.add();
        assertEquals(14, calculator.getResult());
        assertEquals(14, calculator.getResult());

        calculator.enter(3);
        assertThrows(IllegalStateException.class, () -> calculator.enter(5));
    }

    @Test
    void multiplyTest(){
        Calculator calculator = new Calculator();
        calculator.enter(5);
        calculator.enter(6);
        calculator.mul();

        assertEquals(30, calculator.getResult());
    }

    @Test
    void multiplyErrorIfOnlyOneNumber(){
        Calculator calculator = new Calculator();
        calculator.enter(5);
        assertThrows(IllegalStateException.class, calculator::mul);
    }

    @Test
    void multiplyErrorIfThereAreNoNumbers(){
        Calculator calculator = new Calculator();
        assertThrows(IllegalStateException.class, calculator::mul);
    }
}
