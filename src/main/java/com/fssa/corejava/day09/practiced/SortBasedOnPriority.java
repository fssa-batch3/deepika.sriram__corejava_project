package com.fssa.corejava.day09.practiced;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Task2  {
	private int id;
	private String name;
	private LocalDate deadline;
	private Integer priority;
	
	public Task2(int id, String name, LocalDate deadline , Integer priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}
	
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
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	
}

public class SortBasedOnPriority {

	public static void main(String[] args) {
		
		List<Task2> tasks = new ArrayList<>();
		tasks.add(new Task2(3,"Coding",LocalDate.of(2022, 10, 22),2));
		tasks.add(new Task2(5,"Product Design",LocalDate.of(2022, 10, 01),2));
		tasks.add(new Task2(1,"Software Design",LocalDate.of(2022, 10, 07),1));
		tasks.add(new Task2(3,"Coding",LocalDate.of(2022, 10, 22),1));
		
		
		Collections.sort(tasks, Comparator.comparing(Task2::getDeadline).thenComparing(Task2::getPriority));
		
		for (Task2 task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline()+" , "+task.getPriority());
        }
		
		

	}

}

