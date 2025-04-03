package com.bridgeLabz.testing;

import com.bridgeLabz.basicTesting.CalculatorTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTesting {
    @Test
    public void testingAdd(){
        int result = CalculatorTest.sum(4,2);
        int expected = 6;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void testingSubtract(){
        int result = CalculatorTest.subtract(4,2);
        int expected = 2;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void testingDivision(){
        int result = CalculatorTest.divison(4,2);
        int expected = 2;
        Assertions.assertEquals(expected,result);
    }
}
