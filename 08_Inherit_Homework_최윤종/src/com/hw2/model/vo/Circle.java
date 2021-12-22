package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println();
		
		double m = Math.PI* radius * radius;
		double r = Math.PI* radius * 2;
		
		
		System.out.printf("면적 : %.1f" , m);
		System.out.println();
		System.out.printf("둘레 : %.1f" , r);
	}
	
	
	
}
