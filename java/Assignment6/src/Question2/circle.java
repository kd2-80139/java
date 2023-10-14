package Question2;

import java.util.*;

public class circle {
	point2D center = new point2D();
	double diameter;

	public circle() {
		this.diameter = 100;
	}

	public void accessor() {
		center.accept();
		System.out.println("Enter Diameter");

		this.diameter = new Scanner(System.in).nextDouble();
		if (diameter < 0) {
			throw new negativeValueException();

		}

	}

	@Override
	public String toString() {
		return "circle [center= (" + center.getX()+","+center.getY() + ")  , diameter=" + diameter + "]";
	}
	
}
