package com.bridgeLabz.testing;

import com.bridgeLabz.basicTesting.NumberCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberCheckTesting {
    @ParameterizedTest
    @ValueSource(ints={2,4,1,5,6})
    public void shouldCheckNumberIsEven(int nums){
        boolean result = NumberCheck.even(nums);
        Assertions.assertEquals(true,result);
    }
}
//fail for 1,5
//pass for 2,4,6
