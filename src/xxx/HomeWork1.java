package xxx;

public class HomeWork1 {
	public static void main(String[] args) {

		/* 第一題: 請設計一隻Java程式,計算12,6這兩個數值的和與積 */

		int a = 12;
		int b = 6;
		System.out.println(a + b);
		System.out.println(a * b);

		/* 第二題: 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆) */

		// 設定一個變數，型態為int，值為兩百代表兩百顆蛋
		int egg = 200;
		// 設定一個變數，型態為int，值為12代表一打的單位量，因為計算結果會有小數點
		int aDozen = 12;
		// 相除取整數求幾打，使用%求蛋的餘數為幾顆
		int a1 = egg / aDozen, b1 = egg % aDozen;
		System.out.println("200顆蛋共是" + a1 + "打" + b1 + "顆");

		/* 第三題: 請由程式算出256559秒為多少天、多少小時、多少分與多少秒 */

		int ttlSecs = 256559, dOfHrs = 24, hOfMins = 60, mOfSecs = 60;
		// 一天幾秒鐘, 一小時幾秒鐘
		int daySec = dOfHrs * hOfMins * mOfSecs, hrsSec = hOfMins * mOfSecs;
		// 剩餘多少小時秒, 剩餘多少分鐘秒, 剩餘多少秒
		int hrsleft = ttlSecs % daySec, minleft = hrsleft % hrsSec, secleft = minleft % mOfSecs;

		System.out.println("256559秒為" + (ttlSecs / daySec) + "天" + (hrsleft / hrsSec) + "小時" + (minleft / mOfSecs) + "分"
				+ secleft + "秒");

		/* 第四題: 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長 */

		final double PI = 3.1415;
		int r = 5;

		System.out.println("圓面積=" + (r * r * PI));
		System.out.println("圓周長=" + (r * 2 * PI));

		/*
		 * 第五題: 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本 金加利息共有多少錢
		 * (用複利計算,公式請自行google)
		 */

		int y, money = 1_500_000;
		double rate = 0.02;
		double saving = money * (1 + rate);
		for (y = 1; y <= 10; y++) {
			saving *= (1 + rate);
		}
		// double轉int整數
		System.out.println("複利10年本金加利息共有" + (int) saving + "元");

		/*
		 * 第六題: 請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */

		System.out.println(5 + 5);
		// 此為預設整數型別int數值5+型別int數值5，所得為十進位之和int數值10
		System.out.println(5 + '5');
		// 此為預設整數型別int數值5+型別char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		System.out.println(5 + "5");
		// 此為預設整數型別int數值5+型別String字串5，整數與字串相加為串接相連，所得為String字串55
	}
}
