package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("driving", "Somewhere", "Using");
            case PAINTING:
                return new PaintingTask("painting", "Blue", "Sky");
            case SHOPPING:
                return new ShoppingTask("shopping", "shirt", 2);
            default:
                return null;
            }
        }
    }

