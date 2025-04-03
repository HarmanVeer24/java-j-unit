package com.bridgeLabz.testing;

import com.bridgeLabz.basicTesting.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void shouldRaiseArithmeticException(){
        Assertions.assertThrows(ArithmeticException.class,()-> Division.divide(0,5));
    }
}
