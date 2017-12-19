package com.kodilla.spring.calculator;

import com.kodilla.spring.Calculator.Calculator;
import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(2, 3);
        double sub = calculator.sub(5, 4);
        double mul = calculator.mul(5, 4);
        double div = calculator.div(20, 4);
        //Then
        Assert.assertEquals(5.0, sum, 0.1);
        Assert.assertEquals(1.0, sub, 0.1);
        Assert.assertEquals(20.0, mul, 0.1);
        Assert.assertEquals(5.0, div, 0.1);
    }
}
