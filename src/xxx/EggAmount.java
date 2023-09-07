package xxx;

public class EggAmount {
	public static void main(String[] args) {
		// 設定一個變數，型態為int，值為兩百代表兩百顆蛋
		int egg = 200;
		// 設定一個變數，型態為int，值為12代表一打的單位量，因為計算結果會有小數點
		int aDozen = 12;
		// 相除取整數求幾打，使用%求蛋的餘數為幾顆
		int a = egg / aDozen, b = egg % aDozen;
		System.out.println("200顆蛋共是" + a + "打" + b + "顆");

	}
}
