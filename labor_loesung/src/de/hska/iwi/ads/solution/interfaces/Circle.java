package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle{

	public Circle(Vector middlePoint, double radius) {
		super(middlePoint, radius);
		if(radius>0) {
			radius = this.radius;
		}else {
			radius = (Double) null; //radius negativ/0
		}
		Circle circle = new Circle(middlePoint, radius);
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super(radius);
		if(radius>0) {
			radius = this.radius;
		}else {
			radius = (Double) null; //radius negativ/0
		}
	}

	@Override
	public void scale(double factor) {
		if(factor > 0) {
			radius = this.radius * factor;
		}else {
			radius = this.radius * 1;
		}
	}

	@Override
	public double getDimension() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public double area() {
		double area = radius * radius + Math.PI;
		return area;
	}

}
