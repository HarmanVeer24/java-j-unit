package com.bridgeLabz.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutTesting {
    @Test
    @Timeout(2)
    public void shouldTimeoutIfTimeMoreThanTwo()throws InterruptedException{
        Thread.sleep(3000);
    }
}
