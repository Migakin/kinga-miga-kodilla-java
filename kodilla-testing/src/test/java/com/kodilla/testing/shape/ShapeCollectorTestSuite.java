package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure = new Triangle("triangle", 25);
        shapeCollector.addFigure(figure);

        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(figure, retrievedFigure);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure = new Triangle("triangle", 25);
        shapeCollector.addFigure(figure);

        //When
        boolean result = shapeCollector.removeFigure(figure);

        //Then
        Assert.assertTrue(result);
    }


}

