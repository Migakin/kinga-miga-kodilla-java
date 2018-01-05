package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task shopping = factory.prepareTask(TasksFactory.SHOPPING);
        shopping.executeTask();

        //Then
        Assert.assertEquals(true,shopping.isTaskExecuted());
        Assert.assertEquals("Paint shopping",shopping.getTaskName());
    }
    @Test
    public void testPaintingTask(){
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task painting = factory.prepareTask(TasksFactory.PAINTING);
        painting.executeTask();

        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("Indoor painting", painting.getTaskName());
    }
    @Test
    public void testDrivingTask(){
        //Given
        TasksFactory factory = new TasksFactory();

        //When
        Task driving = factory.prepareTask(TasksFactory.DRIVING);
        driving.executeTask();

        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Delivery", driving.getTaskName());
    }
}
