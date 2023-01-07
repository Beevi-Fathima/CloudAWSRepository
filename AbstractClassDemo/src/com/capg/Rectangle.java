package com.capg;

public class Rectangle extends Shapes{
	int l;
	int b;
	public Rectangle() {}
	public Rectangle(int l,int b) {
		this.l = l;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle drawn");
	}
	@Override
	public void calculateArea() {
		System.out.println("Area: "+l*b);
	}
	@Override
	public void method() {
		System.out.println("Hello from rectangle class");
	}

}
