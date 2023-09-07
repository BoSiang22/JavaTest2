package xxx;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class Diameter {
	public static void main(String[] args) {
		final double PI = 3.1415;
		int r = 5;

		System.out.println("圓面積=" + (r * r * PI));
		System.out.println("圓周長=" + (r * 2 * PI));
	}
}
