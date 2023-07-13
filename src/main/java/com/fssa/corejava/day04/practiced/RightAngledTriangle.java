package com.fssa.corejava.day04.practiced;

public class RightAngledTriangle extends Polygon {
	protected double a;
	protected double b;
	
	public RightAngledTriangle(double a , double b)throws Exception{
		super(3);
		if(a<=0 || b<=0) {
			throw new Exception("Invalid dimensions for right angled triangle");
		}
		this.a = a;
		this.b = b;
		
	}
	
	@Override
	public double calculateCircumference() {
		return (this.a + this.b + Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2)));
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
}
