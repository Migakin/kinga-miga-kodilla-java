package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean processStatus;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Painting is being processed");
        processStatus = true;
        return processStatus;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(processStatus){
            return true;
        }else {
            return false;
        }
    }
}
