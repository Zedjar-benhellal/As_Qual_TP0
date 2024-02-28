package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
    }

    @Test
    void multiply() {
    }
    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
        // Act
        double result = calculator.add(a, b);
        // Assert
        assertEquals(5, result);
    }
}