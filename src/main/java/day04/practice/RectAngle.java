package day04.practice;

public class RectAngle extends Polygon {
	protected double length;
	protected double breadth;

	public RectAngle(double length, double breadth) throws Exception {
		super(4);
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return this.length * this.breadth;
	}

	public double calculatePerimeter() {
		return 2 * (this.length + this.breadth);
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 0;
	}
}