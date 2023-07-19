package com.fssa.corejava.day06.practice;

import java.util.*;
public class TaskList {
	
	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task: tasks) {
			if (name.equals(task.getTaskName())) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task("Write", 1));
		tasks.add(new Task("Read", 1));
		tasks.add(new Task("Workout", 1));
		boolean ifFound = findTaskByName("Read", tasks);
		System.out.println("Is task in list: " + ifFound);
	}
}

