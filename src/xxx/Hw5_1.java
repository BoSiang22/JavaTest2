package xxx;

import java.util.Scanner;

public class Hw5_1 {
	public static void main(String[] args) {
		
		System.out.println("請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形");
		int width, height;
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入長方形寬度：");
		width = s.nextInt();
		System.out.println("請輸入長方形長度：");
		height = s.nextInt();
		
		starSquareMethod a = new starSquareMethod();
		a.starSquare(width, height);

		
	}
}


final class starSquareMethod {
	//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
		public void starSquare(int width, int height) {
			for (int i = 0 ; i < height; i++) {
				for(int j = 0; j < width; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	  
}