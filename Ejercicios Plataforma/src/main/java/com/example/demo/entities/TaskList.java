package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private List<Task> taskList;

    //CONSTRUCTOR
    public TaskList(String name) {
        this.name = name;
        this.taskList = new ArrayList<Task>();

    }
    public void addTask(Task task){
        this.taskList.add(task);
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' +
                ", taskList=" + taskList +
                '}';
    }

}
