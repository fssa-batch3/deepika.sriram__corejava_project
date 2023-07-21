package com.fssa.corejava.day10.solved;


class Task {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class NewTaskValidator {
	public static boolean validate(Task task)  {
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}


public class ThrowRunTimeExceptionDemo {

	public static void main(String[] args) {
		Task task = new Task();
		NewTaskValidator.validate(task);
	}

}
