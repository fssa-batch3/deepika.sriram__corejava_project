package com.fssa.corejava.day01.solved;


class Movie {
	public String title;
	
}

public class TestBookComparison {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.title = "Harry Potter";
		
		Movie movie2 = new Movie();
		
		movie2.title = "Harry Potter";
		System.out.println(movie1 == movie2);
		
		
		
	}
}
