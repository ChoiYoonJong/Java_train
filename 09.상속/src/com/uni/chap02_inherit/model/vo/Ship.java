package com.uni.chap02_inherit.model.vo;

public class Ship extends Vehicle {
	
	private int propeller;
	
	public Ship() {
		// TODO Auto-generated constructor stub
	}

	public Ship(String name, double mileage, String kind,int propeller) {
		super(name, mileage, kind);
		// TODO Auto-generated constructor stub
		
		this.propeller = propeller;
		
		
		
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String toString() {
		return "Ship [propeller=" + propeller + super.toString() + "]";
		
		
	}

	@Override
	public void howToMove() {
		// TODO Auto-generated method stub
		System.out.println("프로펠러를 이용해서 움직인다.");
	}
	
	
	
	
	
	

}
