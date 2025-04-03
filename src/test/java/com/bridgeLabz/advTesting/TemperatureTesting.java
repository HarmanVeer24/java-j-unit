package com.bridgeLabz.advTesting;

import com.bridgeLabz.advtesting.Temperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTesting {
    @Test
    public void shouldConvertCorrectlyCtoF(){
        double result = Temperature.celsiusToFahrenheit(37);
        double expected = 98.6;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void shouldConvertCorrectFtoC(){
        double result = Temperature.fahrenheitToCelsius(86);
        double expected = 30;
        Assertions.assertEquals(expected,result);
    }
}
