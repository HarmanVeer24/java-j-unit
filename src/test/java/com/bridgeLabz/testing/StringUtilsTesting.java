package com.bridgeLabz.testing;

import com.bridgeLabz.basicTesting.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTesting {
    @Test
    public void shouldReverseString(){
        String result = StringUtils.reverse("Harman");
        String expected = "namraH";
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void shouldCheckStringIsPalindrome(){
        boolean result = StringUtils.isPalindrome("racecar");
        boolean expected = true;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void shouldCheckStringIsInUpperCase(){
        String result = StringUtils.toUpperCase("Harman");
        String expected = "HARMAN";
        Assertions.assertEquals(expected,result);
    }
}
