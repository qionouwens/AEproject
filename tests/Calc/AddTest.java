package Calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    @Test
    void evaluateSingleElement() {
        Add testAdd = new Add();
        testAdd.add(new Int(8));
        Expression result = testAdd.evaluate();
        assertEquals(new Int(8), result);
    }

    @Test
    void evaluateIntegers() {

    }
}