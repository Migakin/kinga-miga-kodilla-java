package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task prepareTask(final String taskType){
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Paint shopping", "blue paint", 3);
            case PAINTING:
                return new PaintingTask("Indoor painting", "blue", "door");
            case DRIVING:
                return new DrivingTask("Delivery", "Poznań", "whatever");
            default:
                return null;

        }

    }
}
