package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {

		/*
		 * 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		 * (提示：陣列，length屬性)
		 */
		
		int [] arr={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        double sum =0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg =  sum / arr.length;
        System.out.println("此陣列所有元素的平均值:" + avg);
        System.out.print("陣列內元素大於平均值的元素:");
        for(int i = 0; i < arr.length;i++){
            if (arr[i] > avg){
                System.out.print(arr[i] + " ");
            }
        }
		
		
		
		
//		 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		 例如String s = “Hello World”，執行結果即為dlroW olleH
//		 (提示：String方法，陣列)
		
        String string = "Hello World";
		String sToReverse = "";
		for (int i = 0; i < string.length(); i++)
			sToReverse = string.charAt(i) + sToReverse;
		System.out.print(sToReverse);
		
		
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
		
		String[] stars ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int sum1 = 0;
        
        for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i].length(); j++) {
				switch (stars[i].charAt(j)) {
				case 'a':
					sum1 += 1;
					break;
				case 'e':
					sum1 += 1;
					break;
				case 'i':
					sum1 += 1;
					break;
				case 'o':
					sum1 += 1;
					break;
				case 'u':
					sum1 += 1;
					break;
				}
			}
		}
		System.out.print(sum1);
		
		
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
//		(提示：Scanner，二維陣列)
		
		int[][] people = { {25, 32, 8, 19, 27}, 
				   {2500, 800, 500, 1000, 1200}
				 };
		Scanner sc = new Scanner(System.in);
		System.out.println("你想借多少錢: ");
		int money = sc.nextInt();
		System.out.print("員工編號: ");
		int sum2 = 0;
		for (int i = 0; i < people[0].length; i++) {
			if (people[1][i] > money) {
				System.out.print(people[0][i]+" ");
				sum2++;
			}
		}
		System.out.print("共" + sum2 + "人");
		
		
		
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
		int[] yearOfMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count =0;
        Scanner sc1 = new Scanner (System.in);
        System.out.println("請輸入年:");
        int year = sc1.nextInt();
        System.out.println("請輸入月份:");
        int month = sc1.nextInt();
        System.out.println("請輸入日期:");
        int day = sc1.nextInt();
        
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
		
		
//		班上有8位同學，他們進行了6次考試結果如下：(看PDF檔裡的圖)
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)
		
        int scores[][] = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,70,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		
		int[] students = new int[8];
		for(int i = 0; i < scores.length; i++) {
			int[] a = Arrays.copyOf(scores[i], scores[i].length);
			Arrays.sort(a);
			int h = a[a.length-1];
			for(int j = 0; j < students.length; j++) {
				if(scores[i][j] == h) {
					students[j] += 1;
				}
			}
		}
		for (int k = 0; k < students.length; k++) {
		System.out.println("每位同學考最高分的次數分別為: " + students[k] + " ");
		}
		
		
	}
}
