package com.fssa.corejava.day06.practice;

public class Task {
	public String taskName;
    public int priority;
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}
}