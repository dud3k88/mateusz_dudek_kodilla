package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createFirstLog() {
        Logger.getInstance().log("My first log");
    }

    @Test
    public void testLog() {
        Logger.getInstance().log("It's my second log");
        Assert.assertEquals("It's my second log", Logger.getInstance().getLastLog());
    }

    @Test
    public void testGetLastLog() {
        Logger.getInstance().log("hello");
        Logger.getInstance().log("it is");
        Logger.getInstance().log("my last log");
        Assert.assertEquals("my last log", Logger.getInstance().getLastLog());
    }

}
