package xxx;

public class Powder implements WeightTable {
	private String color;
	private double weight;

	public Powder() {
		super();
	}

	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

//	public abstract getWeightTool() {
//		return this.weight;
//	}

	@Override
	public void getWeightTool() {
		// TODO Auto-generated method stub
		System.out.println("天秤");
	}
}
