package xxx;

public class HomeWork2 {
	public static void main(String[] args) {
		// 第一題: 計算1 ~ 1000的偶數和
		int sum = 0;
		for (int i = 2; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("============");

		// 第二題: 計算1~10的連乘積 (用for迴圈)
		int sum1 = 1;
		for (int i = 1; i <= 10; i++) {
			sum1 *= i;
		}
		System.out.println(sum1);
		System.out.println("============");

		// 第三題: 計算1~10的連乘積 (用while迴圈)
		int sum2 = 1, i = 1;
		while (i <= 10) {
			sum2 *= i;
			i++;
		}
		System.out.println(sum2);
		System.out.println();
		System.out.println("============");
		/*
		 * 第四題: 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		 */
		// 概念：後一位數與前一位數之差，依序為1 3 5 7 9 11 13 15 17 19

		int odd = 0;
		for (int number = 0; number <= 20; number++) {
			if (number % 2 == 0) { // 先篩選出20以內的奇數數字
				continue;
			}
			odd += number; // 將篩選出的奇數數字加總
			// 列出篩選出的奇數數字，並用一格空白格做各個奇數的間隔
			System.out.print(odd + " ");
		}
		System.out.println();
		System.out.println("============");

		/*
		 * 第五題: 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。 請設計一隻程式,
		 * 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 */
		int start = 1, sum3 = 0;
		for (start = 1; start <= 49; start++) {
			if (start % 4 != 0) {
//				System.out.println("大文可以選擇的數字有哪些");
				System.out.print(start + " ");
//				System.out.println("總共有幾個");
//				System.out.println();
				sum3++;

			}
		}
		System.out.println();
		System.out.println("============");
		System.out.println(sum3);
		System.out.println("============");

		/*
		 * 第六題: 請設計一隻Java程式,輸出結果為以下: 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6
		 * 7 8 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
		 */

		for (int c = 11; c > 1; c--) {
			for (int d = 1; d < c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}

		System.out.println("============");

		/*
		 * 第七題: 請設計一隻Java程式,輸出結果為以下: A BB CCC DDDD EEEEE FFFFFF
		 */

		for (int e = 1; e <= 6; e++) {
			switch (e) {
			case 1:
				System.out.print("A");
				System.out.println();
				break;
			case 2:
				System.out.print("BB");
				System.out.println();
				break;
			case 3:
				System.out.print("CCC");
				System.out.println();
				break;
			case 4:
				System.out.print("DDDD");
				System.out.println();
				break;
			case 5:
				System.out.print("EEEEE");
				System.out.println();
				break;
			default:
				System.out.print("FFFFFF");
				System.out.println();
				break;
			}

		}

	}
}
