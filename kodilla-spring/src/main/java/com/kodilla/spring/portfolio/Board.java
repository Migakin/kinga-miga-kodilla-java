package com.kodilla.spring.portfolio;

public final class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void showTasks() {
      System.out.println("to do: " + toDoList.getTasks() + " in progress: " + inProgressList.getTasks() + " done: " + doneList.getTasks());

    }

}
