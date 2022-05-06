package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculatorTest = new Calculator();

    @Test
    public void addition() {
        String failMessage = "Addition Test Expected.";
        assertEquals(failMessage, 5, calculatorTest.addition(2, 3));
        assertEquals(failMessage, 30, calculatorTest.addition(10, 20));
        assertEquals(failMessage, 26, calculatorTest.addition(13, 13));
    }

    @Test
    public void division() {
        String failMessage = "Division Test Expected.";
        assertEquals(failMessage, 2, calculatorTest.division(10, 5));
        assertEquals(failMessage, 15, calculatorTest.division(150, 10));
        assertEquals(failMessage, 50, calculatorTest.division(100, 2));
    }

    @Test
    public void subtraction() {
        String failMessage = "Subtraction Test Expected.";
        assertEquals(failMessage, 4, calculatorTest.subtraction(8, 4));
        assertEquals(failMessage, 6, calculatorTest.subtraction(16, 10));
        assertEquals(failMessage, 8, calculatorTest.subtraction(24, 16));
    }

    @Test
    public void multiplication() {
        String failMessage = "Multiplication Test Expected.";
        assertEquals(failMessage, 25, calculatorTest.multiplication(5, 5));
        assertEquals(failMessage, 100, calculatorTest.multiplication(25, 4));
        assertEquals(failMessage, 26, calculatorTest.multiplication(13, 2));
    }

    @Test
    public void dblAddition() {
        String failMessage = "Addition Test Expected. (Double)";
        assertEquals(failMessage, 6.2, calculatorTest.dblAddition(3.1, 3.1), 0);
        assertEquals(failMessage, 2.6, calculatorTest.dblAddition(1.3, 1.3), 0);
        assertEquals(failMessage, 4.7, calculatorTest.dblAddition(2.5, 2.2), 0);
    }

    @Test
    public void dblDivision() {
        String failMessage = "Division Test Expected. (Double)";
        assertEquals(failMessage, 3.0, calculatorTest.dblDivision(9.9, 3.3 ), 2);
        assertEquals(failMessage, 3.0, calculatorTest.dblDivision(12.6, 4.2), 0);
        assertEquals(failMessage, 4.0, calculatorTest.dblDivision(20.8, 5.2), 0);
    }

    @Test
    public void dblSubtraction() {
        String failMessage = "Subtraction Test Expected. (Double)";
        assertEquals(failMessage, 3.2, calculatorTest.dblSubtraction(6.5, 3.3), 2);
        assertEquals(failMessage, 3.4, calculatorTest.dblSubtraction(10.7, 7.3), 2);
        assertEquals(failMessage, 25.01, calculatorTest.dblSubtraction(26.05, 1.04), 2);
    }

    @Test
    public void dblMultiplication() {
        String failMessage = "Multiplication Test Expected. (Double)";
        assertEquals(failMessage, 7.26, calculatorTest.dblMultiplication(2.2, 3.3),0);
        assertEquals(failMessage, 211.12, calculatorTest.dblMultiplication(10.4, 20.3),0);
        assertEquals(failMessage, 178.22, calculatorTest.dblMultiplication(13.4, 13.3),2);
    }
}