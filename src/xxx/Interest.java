package xxx;

public class Interest {
	public static void main(String[] args) {
		int y, money = 1_500_000;
		double rate = 0.02;
		double saving = money * (1 + rate);
		for (y = 1; y <= 10; y++) {
			saving *= (1 + rate);
		}
		// double轉int整數
		System.out.println("複利10年本金加利息共有" + (int) saving + "元");

	}
}
