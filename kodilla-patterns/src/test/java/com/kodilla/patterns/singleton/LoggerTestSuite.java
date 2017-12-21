package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){

        //Given
        Logger.getInstance().log("blablabla");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("blablabla", lastLog);
    }

}
