package exercise;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw10_2 {
	public static void main(String[] args) {
		
		Boolean a = true;
		
		while(a) {
			try {
				Scanner sc = new Scanner(System.in);
		
				System.out.println("請輸入數字:");
				double d = sc.nextDouble();
				System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");

				String num = "[1-3]";
				String select;

				while(!(select = sc.next()).matches(num)){
					System.out.println("請輸入數字1或2或3，請再輸入一次！");
					System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
				}
			
				
				switch(select) {
					case "1" :
						Format thousand = new DecimalFormat("#,###");
						System.out.println(thousand.format(d));
						break;
					case "2" :
						Format hundred = new DecimalFormat("#%");
						System.out.println(hundred.format(d));
						break;
					case "3" :	
						Format science = new DecimalFormat("#.####E0");
						System.out.println(science.format(d));
						break;
				}
				
				a = false;
			} catch(InputMismatchException e) {
				System.out.println("數字格式不正確，請再輸入一次！");
			}

		}
		
	}
	
	
}
