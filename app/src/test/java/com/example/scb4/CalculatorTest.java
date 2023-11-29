package com.example.scb4;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int expected = 30;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }

    public void testPostiveNegative(){
        int expected = -15;
        int actual = Calculator.add(10,-20);
        assertEquals(expected,actual);
    }

    public void sub(){
        int expected = -5;
        int actual = Calculator.sub(10,15);
        assertEquals(expected,actual);
    }
}