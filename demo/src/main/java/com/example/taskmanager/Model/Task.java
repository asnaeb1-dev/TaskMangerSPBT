package com.example.taskmanager.Model;

public class Task {
    private String _id;
    private String taskTitle;
    private String taskDesc;
    private Boolean completed;

    public Task() {
    }

    public Task(String _id, String taskTitle, String taskDesc, Boolean completed) {
        this._id = _id;
        this.taskTitle = taskTitle;
        this.taskDesc = taskDesc;
        this.completed = completed;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "_id='" + _id + '\'' +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", completed=" + completed +
                '}';
    }
}
