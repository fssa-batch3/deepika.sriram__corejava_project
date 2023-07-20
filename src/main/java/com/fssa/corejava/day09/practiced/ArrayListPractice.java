package com.fssa.corejava.day09.practiced;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in an unsorted order : ");
		number.add(sc.nextInt());
		number.add(sc.nextInt());
		number.add(sc.nextInt());
		number.add(sc.nextInt());
		number.add(sc.nextInt());
		
		Collections.sort(number);
		
		System.out.println("The sorted array is : "+number);
	}

}
