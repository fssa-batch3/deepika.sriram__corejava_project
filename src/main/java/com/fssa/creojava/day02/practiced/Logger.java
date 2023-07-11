package com.fssa.creojava.day02.practiced;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("INFO: "+msg);
	}
	
	public static void error (String msg) {
		System.out.println("ERROR: "+msg);
	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: "+num);
	}
	
}
