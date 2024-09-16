package com.vv;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LoggerTest {

    @Test
    public void verifyIfTheInstancesAreTheSame() {
        Logger firstLog = Logger.getInstance();
        Logger secondLog = Logger.getInstance();
        Logger thirdLog = Logger.getInstance();

        Assert.assertEquals(firstLog, secondLog);
        Assert.assertEquals(secondLog, thirdLog);
    }

}
