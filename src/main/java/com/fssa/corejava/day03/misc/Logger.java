package com.fssa.corejava.day03.misc;

import java.time.LocalDateTime;

public class Logger {
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void debug(String msg) {
		LocalDateTime time = LocalDateTime.now();
		
		System.out.println(time.toString().concat(msg));
	}
}
