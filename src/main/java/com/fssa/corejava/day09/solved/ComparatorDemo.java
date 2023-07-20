package com.fssa.corejava.day09.solved;

import java.util.*;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}


class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}


class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Deepika", 25));
		al.add(new Student(106, "Uthra", 21));
		al.add(new Student(105, "Saranya", 27));

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
