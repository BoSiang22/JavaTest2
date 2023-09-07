package xxx;

public class Cube {
	private double length1;
	private double length2;
	private double length3;

	public Cube() {
	}

	public Cube(double a, double b, double c) {
//		System.out.println(a*b*c);
	}

	public double getLength() {
		return length1 * length2 * length3;
	}

	public void setLength() {
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}

}
