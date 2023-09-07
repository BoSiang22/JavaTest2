package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Date = "";
		String dateRegex = "^[0-9]{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$";
		String otherRegex = "^[1-3]$";
		
		String theOther = "";
		Date date = null;
		
		
		System.out.println("請輸入日期，格式:年月日YYYYMMDD: ");
		Date = sc.next();
			
		while(!(Date.matches(dateRegex))) {
			System.out.println("輸入錯誤 請重新輸入日期，格式:年月日YYYYMMDD: ");
			Date = sc.next();
		}
		
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(Date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("選擇輸出格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
		theOther = sc.next();
		while(!(theOther.matches(otherRegex))) {
			System.out.println("輸入錯誤 請重新選擇輸出格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
			theOther = sc.next();
		}
		
		
		SimpleDateFormat outputFormat = null;
        
        switch (theOther) {
        case "1":
        	outputFormat = new SimpleDateFormat("yyyy/MM/dd");
        	break;
        	
        case "2":
        	outputFormat = new SimpleDateFormat("MM/dd/yyyy");
        	break;
        	
        case "3":
        	outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        	break;
        }
        
        System.out.println(outputFormat.format(date));
		sc.close();
	}
	
}
