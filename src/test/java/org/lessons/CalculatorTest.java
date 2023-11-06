package org.lessons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Verify correct sum")
    void getSum() {
        for (int i = 0; i < 10; i++) {
            assertEquals(i + i, Calculator.add(i, i));
        }

        for (int i = 19; i < 19 * 10; i += 19) {
            assertEquals(i + i, Calculator.add(i, i));
        }
    }

    @Test
    @DisplayName("Verify correct difference")
    void getDifference() {
        for (int i = 0; i < 10; i++) {
            assertEquals(0, Calculator.subtract(i, i));
        }

        for (int i = 19; i < 19 * 10; i += 19) {
            assertEquals(i+i, Calculator.subtract(i, - i));
        }
    }

    @Test
    @DisplayName("Verify correct quotient")
    void getQuotient() throws IllegalArgumentException {
        for (int i = 1; i < 10; i++) {
            assertEquals((float) 10 / i, Calculator.divide(10, i));
        }

        for (int i = 1; i < 10; i++) {
            assertEquals(1, Calculator.divide(i, i));
        }

        for (int i = 19; i < 19 * 10; i += 19) {
            assertEquals(0, Calculator.divide(0, i));
        }

        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10, 0));
    }

    @Test
    @DisplayName("Verify correct product")
    void getProduct() {
        for (int i = 0; i < 10; i++) {
            assertEquals(i * i, Calculator.multiply(i, i));
        }

        for (int i = 19; i < 19 * 10; i += 19) {
            assertEquals(i * i, Calculator.multiply(i, i));
        }
    }
}