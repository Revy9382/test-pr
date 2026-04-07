package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    /*@Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-5, calculator.add(-2, -3), "-2 + (-3) should equal -5");
    }*/

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-2, calculator.subtract(-1, 1), "-1 - 1 should equal -2");
        assertEquals(1, calculator.subtract(-2, -3), "-2 - (-3) should equal 1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-3, calculator.multiply(-1, 3), "-1 * 3 should equal -3");
        assertEquals(6, calculator.multiply(-2, -3), "-2 * (-3) should equal 6");
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should equal -2");
        assertEquals(2, calculator.divide(-6, -3), "-6 / (-3) should equal 2");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}
