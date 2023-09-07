package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		try {
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			System.out.println("請輸入y的值:");
			int y = sc.nextInt();
			System.out.println(x + "的" + y + "次方等於" + cal.powerXY(x, y));
			
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}
		catch(CalException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
