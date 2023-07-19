package com.fssa.corejava.day07.practiced;

import java.util.ArrayList;
import java.util.HashSet;

class Task {
    private String name;
    private String deadline;

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return name.equals(task.name) && deadline.equals(task.deadline);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + deadline.hashCode();
    }
}

public class TaskList {
    public static void main(String[] args) {
        // Create an ArrayList of Task
        ArrayList<Task> taskArrayList = new ArrayList<>();

        // Add tasks to the ArrayList
        taskArrayList.add(new Task("Task1", "2023-07-25"));
        taskArrayList.add(new Task("Task2", "2023-07-20"));
        taskArrayList.add(new Task("Task1", "2023-07-25"));
        taskArrayList.add(new Task("Task3", "2023-07-28"));
        taskArrayList.add(new Task("Task2", "2023-07-20"));

        // Print the ArrayList with duplicates
        System.out.println("ArrayList with duplicates:");
        for (Task task : taskArrayList) {
            System.out.println(task.getName() + " - " + task.getDeadline());
        }

        // Use HashSet to remove duplicates
        HashSet<Task> taskHashSet = new HashSet<>(taskArrayList);
        taskArrayList.clear();
        taskArrayList.addAll(taskHashSet);

        // Print the ArrayList without duplicates
        System.out.println("\nArrayList without duplicates:");
        for (Task task : taskArrayList) {
            System.out.println(task.getName() + " - " + task.getDeadline());
        }
    }
}
