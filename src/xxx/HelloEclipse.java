package xxx;

import java.util.Scanner;

public class HelloEclipse {

	// This is comment

	/*
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		

		/*
		 * 第四題: 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		 */
		// 概念：後一位數與前一位數之差，依序為1 3 5 7 9 11 13 15 17 19

//		int odd = 0;
//		
//		for(int number =0; number <= 20; number++) {
//			if(number % 2 == 0) {
//				continue;
//			}
//		odd += number;
//		System.out.print(odd + " ");
//		System.out.println();
//		System.out.println("==========");
//		
//		}

//		for (int i = 11; i >= 1; i--) { //輸出後共10行，且為號碼數遞減
//			for (int j = 1; j < i ; j++){//輸出1~10，每到下一行便少一個尾數
//			System.out.print(j + " ");
//			}
//		System.out.println();
//		}

		Scanner input = new Scanner(System.in);

		// 輸入三角形三邊長
		System.out.println("請輸入三角形的第一個邊長");
		int a = input.nextInt();
		System.out.println("請輸入三角形的第二個邊長");
		int b = input.nextInt();
		System.out.println("請輸入三角形的第三個邊長");
		int c = input.nextInt();

		// 判斷三角形種類
		if (a + b <= c || a + c <= b || c + b <= a)
		// 如何構成三角形: 三角形的邊長必須要符合 兩邊和大於第三邊
		{
			System.out.println("輸入三邊長，無法構成三角形");
		} else if (a == b && b == c && c == a) {
			System.out.println("正三角形");
		} else if (a == b || b == c || c == a) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("不規則三角形");
		}

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int i =50;
//		i=2;
//		System.out.println(i);
//		final int i3 = 5;
//		System.out.println(i3);

//		int a = 1, b = 1;
//		System.out.println(a++);
//		System.out.println(b-- + 5);
//		
//		System.out.println(a);
//		System.out.println(b);

//		for(int i = 1; i < 10; i++) {
//			if(i == 5)
//				continue;
//			System.out.println("i = " + i);
//		}

//		for(int i = 1; i < 10; i++) {
//			if(i == 5)
//			break;
//			System.out.println("i = " + i);
//			}

//		back : {
//			for(int i = 0; i < 10; i++) {
//			if(i == 9) {
//			System.out.println("break");
//			break back;
//			}
//			}
//			System.out.println("test");
//			}

//		back1:
//			for(int i = 0; i < 10; i++){
//			back2:
//			for(int j = 0; j < 10; j++) {
//			if(j == 9) {
//			continue back1;
//			}
//			}
//			System.out.println("test");
//			}

//		System.out.println(0-1);

	}
//	public static void test() {
//		int i =1000;
//		final int i2 = 1200;
//		System.out.println(i2);
//	}

}
