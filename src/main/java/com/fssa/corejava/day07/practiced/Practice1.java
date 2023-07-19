package com.fssa.corejava.day07.practiced;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		
		System.out.println(arr);
		
		Set<Integer> set = new HashSet<>(arr);
		System.out.println(set);
	}

}
