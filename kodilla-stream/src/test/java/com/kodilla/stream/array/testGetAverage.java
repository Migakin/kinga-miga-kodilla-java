package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class testGetAverage {
    @Test
    public void testGetAverage(){
        //Given
        int[] num = {5, 3, 1};

        //When
        double calculatedAverage = ArrayOperations.getAverage(num);


        //Then
        Assert.assertEquals(3, calculatedAverage, 0.01);



    }

    @Test
    public void testGetAverage2(){
        //Given
        int[] num = {5, 3, 1};

        //When
        double calcAvrg = ArrayOperations.getAverage2(num);

        //Then
        Assert.assertEquals(3, calcAvrg, 0.01);
    }
}
