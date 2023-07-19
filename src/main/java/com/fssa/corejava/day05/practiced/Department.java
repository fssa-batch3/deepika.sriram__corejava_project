package com.fssa.corejava.day05.practiced;

public class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public void printDeptDetails() {
		System.out.println("Department Name: " + deptName);
		System.out.println("Department Id: " + deptId);
	}
	
	@Override
	public String toString() {
		return "deptName=" + deptName + ", deptId=" + deptId;
	}
}
