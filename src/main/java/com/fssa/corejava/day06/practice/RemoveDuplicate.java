package com.fssa.corejava.day06.practice;
import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicate {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		List<String> newList = cityList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);
	}
}
