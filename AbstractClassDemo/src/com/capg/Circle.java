package com.capg;

public class Circle extends Shapes{
	double radius;
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle drawn");
	}
	@Override
	public void calculateArea() {
		System.out.println("Area: "+3.14*radius*radius);
	}
	@Override
	public void method()
	{
		System.out.println("Hello from circle class");
	}
}
