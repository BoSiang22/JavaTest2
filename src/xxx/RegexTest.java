package xxx;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String tel = sc.next();
//		
//		String regex = "^09\\d\\d-[0-9]{6}$";
//		
//		if (tel.matches(regex)) {
//			System.out.println("OK");
//			
//		}else {
//			System.out.println("No good...");
//		}
		
		//身份證字號驗證
		System.out.println("請輸入身分證字號:");
		Scanner sc = new Scanner(System.in);
		String iden = sc.next();
		
		
		
		String regex = "^[A-Za-z][12]\\d[0-9]{7}$";
		
		if(iden.matches(regex)) {
			System.out.println("這是你的身分字號");
		}else {
			System.out.println("您輸入錯的身分證字號");
		}
		
	}
}
