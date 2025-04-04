package com.bridgeLabz.advTesting;

import com.bridgeLabz.advtesting.DateFormating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormatingTesting {
    @Test
    public void shouldReturnCorrectDateAfterFormating(){
        String result = DateFormating.DateFormatting("2024-12-25");
        String expected = "25-12-2024";
        Assertions.assertEquals(expected,result);
    }
}
