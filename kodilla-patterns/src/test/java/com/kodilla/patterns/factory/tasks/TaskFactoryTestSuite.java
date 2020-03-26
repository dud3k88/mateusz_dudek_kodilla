package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private static TaskFactory taskFactory;

    @BeforeClass
    public static void beforeClass() {
        taskFactory = new TaskFactory();
    }

    @Test
    public void testDrivingTask() {
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("driving", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

}
