package xxx;

public class TestBMI2 {
	public static void main(String[] args) {
		double weight = 63;
		double height = 1.8;

		double bmi = weight / Math.pow(height, 2);
		System.out.println(bmi);
		System.out.println("Bmi = " + bmi);
		System.out.printf("Bmi = %.2f%n", bmi);

		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (18.5 >= bmi && bmi < 24) {
			System.out.println("正常");
		} else {
			System.out.println("過胖");
		}
	}
}
