package Calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CosTest {
    @Test
    public void testConstructor() {
        Cos test = new Cos(15);
        Int result = new Int(15);
        assertEquals(result, test.getContents());
    }
}