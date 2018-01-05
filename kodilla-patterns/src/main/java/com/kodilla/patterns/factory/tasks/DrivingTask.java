package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {
    final String taskName;
    final String where;
    final String using;
    boolean processStatus;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Driving is being processed");
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
