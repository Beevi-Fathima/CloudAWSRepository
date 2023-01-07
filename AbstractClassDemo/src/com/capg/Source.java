package com.capg;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes rec = new Rectangle(2,3);
		rec.draw();
		rec.method();
		rec.calculateArea();
		Shapes circ = new Circle(5);
		circ.draw();
		circ.method();
		circ.calculateArea();

	}

}
