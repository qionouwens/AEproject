package Calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    @Test
    void equalsTest() {
        Add add1 = new Add(new Int(4), new Sqrt(new Int(3)));
        Add add2 = new Add(new Int(4), new Sqrt(new Int(3)));
        assertEquals(add1, add2);
    }

    /*
    @Test
    void evaluateSingleElement() {
        Add testAdd = new Add();
        testAdd.add(new Int(8));
        Expression result = testAdd.evaluate();
        assertEquals(new Int(8), result);
    }

    @Test
    void evaluateIntegers() {
        Add testAdd = new Add(new Int(8), new Int(3));
        Expression result = testAdd.evaluate();
        assertEquals(new Int(11), result);
    }

    @Test
    void testNestedAdd() {
        Add nestAdd = new Add(new Sqrt(new Int(3)), new Cos(new Int(2)));
        Add testAdd = new Add(new Int(3), nestAdd);
        Add result = new Add(new Int(3), new Sqrt(new Int(3)));
        result.add(new Cos(new Int(2)));
        assertEquals(result, testAdd.evaluate());
    }

    @Test
    void testNestedWithResult() {
        Add nestAdd = new Add(new Sqrt(new Int(3)), new Int(2));
        Add testAdd = new Add(new Int(3), nestAdd);
        Add result = new Add(new Sqrt(new Int(3)), new Int(5));
        assertEquals(result, testAdd.evaluate());
    }

     */
}