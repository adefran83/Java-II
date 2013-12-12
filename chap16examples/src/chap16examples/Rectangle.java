package chap16examples;

public class Rectangle implements Comparable<Rectangle> {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// provided as a means to sort Rectangles
	public double area() {
		return this.length * this.width;
	}

	// we decide to sort by area
	public int compareTo(Rectangle o) {
		if(area() > o.area()) {
			return 1;
		} else if(area() > o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public double perimeter(){
		double sideA = this.length*2;
		double sideB = this.width*2;
		return sideA + sideB;
	}
	
	public int compareToPerim(Comparable<Rectangle> minValue) {
		if(perimeter() > ((Rectangle) minValue).perimeter()) {
			return 1;
		} else if(perimeter() < ((Rectangle) minValue).perimeter()) {
			return -1;
		} else {
			return 0;
		}
	}
}
