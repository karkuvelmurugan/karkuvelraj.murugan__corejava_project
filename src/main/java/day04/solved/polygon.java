package day04.solved;

public abstract class polygon {
	protected int numberOfSides;

	public polygon(int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		} else {
			this.numberOfSides = numberOfSides;
		}
	}

	public abstract double calculateArea();
}