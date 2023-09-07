package xxx;

import java.util.Scanner;
import java.lang.Math;

public class HomeWork3 {
	public static void main(String[] args) {

		/*
		 * 第一題: 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形,如圖示結果:
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("請輸入三個整數代表三角形的三個邊");

		int side1 = s.nextInt();
		int side2 = s.nextInt();
		int side3 = s.nextInt();
		if (side1 == side2 && side2 == side3 && side3 == side1) {
			System.out.println("正三角形");
		}

		else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
			System.out.println("不是三角形");
		} else if (side1 == side2 || side2 == side3 || side3 == side1) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}

		/*
		 * 第二題: 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜 對則顯示正確訊息,如圖示結果:
		 */

		int a = (int) (Math.random() * 10);
		System.out.println("猜數字遊戲，請輸入0~9的數字");
		Scanner b = new Scanner(System.in);

		while (true) {

			int guess = b.nextInt();
			if (guess == a) {
				System.out.println("恭喜數字猜正確");
				System.out.println("答對了! 答案就是" + guess);
				break;
			} else if (guess != a) {
				System.out.println("猜錯數字");
				System.out.println("請再次輸入一個在0~9之間的數字，" + "記得不要重複猜一樣的數字");
			}
		}

		/*
		 * 第三題: 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
		 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇 的號碼與總數,如圖:
		 */

		System.out.println("請輸入數字1~9不想要的一個數字");
		Scanner d = new Scanner(System.in);
		int doNot = d.nextInt();
		int num = 0;

		System.out.println("可選擇的數字：");
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == doNot) || i % 10 == doNot)) {
				System.out.print(i + " ");
				num++;
			}
			if ((i % 10 == 0)) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("總共有 " + num + " 個數字可選擇");

	}
}
