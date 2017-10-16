package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure (Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure (Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape figure = figures.get(n);
        return figure;
    }

    public ArrayList<Shape> showFigures(){
        return figures;

    }

}
