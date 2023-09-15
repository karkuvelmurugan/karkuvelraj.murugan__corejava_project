package day05.solved;

/**
 * @author BharathwajSoundarara
 *
 */
public class TestInfPolygon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polygon p = new Rectangle();
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);
		
		p = new RightAngledTriangle();
		
		area = p.area(5,  6);
		
		System.out.println("Newly calculated Area: " + area);

	}

}