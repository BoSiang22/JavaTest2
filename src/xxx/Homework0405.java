package xxx;

import java.util.Scanner;

public class Homework0405 {
	public static void main(String[] args) {
		int[] yearOfMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count =0;
        Scanner sc = new Scanner (System.in);
        System.out.println("請輸入年:");
        int year = sc.nextInt();
        System.out.println("請輸入月份:");
        int month = sc.nextInt();
        System.out.println("請輸入日期:");
        int day = sc.nextInt();
        
        if (year % 4 != 0){
            if(day > yearOfMonth[month-1]){
                System.out.println(month+"月沒有到第" + day + "天，停止運作，" + year + "不是閏年");
            }else{
                for(int i = 0;i <month -1;i++){
                    count += yearOfMonth[month-1];
                }
                count += day;
                System.out.println(year+ "年" + month + "月" +day+ "日是該年的第" +count+ "天，"+year+ "年不是閏年");
            }
            
        }else{
            int[] yearOfMonth2={31,29,31,30,31,30,31,31,30,31,30,31};
            if(day > yearOfMonth2[month-1]){
                System.out.println(month+"月沒有到第"+day+"天，停止運作，"+year+"是閏年");
            }else{
                for(int i = 0;i <month -1;i++){
                    count += yearOfMonth[month-1];
                }
                count += day;
                System.out.println(year+"年"+month+"月"+day+"日是該年的第"+count+"天，"+year+"年是閏年");
            }
        }
    
	}
}
