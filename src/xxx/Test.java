package xxx;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("請輸入不想要的數字：");

		Scanner no = new Scanner(System.in);
		int a = no.nextInt();
		int num = 0;

		System.out.println("可選擇的數字：");
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == a) || i % 10 == a)) {
				System.out.print(i + "\t");
				num++;
			}
			if ((i % 10 == 0)) {
				System.out.println();
			} // 遇到某些數字排列會不太整齊
		}
		System.out.println();
		System.out.println("共有 " + num + " 個數字可選擇");
	}
}
