package com.example.todo;

public class Todo {
    private int id;
    private String task;
    private boolean completed;

    public Todo(int id, String task) {
        this.id = id;
        this.task = task;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getTask() { return task; }
    public boolean isCompleted() { return completed; }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return id + ". " + task + " [" + (completed ? "Done" : "Pending") + "]";
    }
}
