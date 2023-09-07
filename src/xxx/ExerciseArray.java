package xxx;

/* 網路的題目:(以陣列方式呈現)
擲骰子1000次，統計看看點數1~6個出現幾次 
*/ 
public class ExerciseArray {
	public static void main(String[] args) {
		//連零點的陣列也宣告出來所以是0~6點 共7個點數
		int[] p = new int[7];
		
		for(int i=0; i<1000; i++) {
			//雖然我們有宣告出0點的陣列，但是產生亂數時我們不要它所以最後加1,求 1~6 點的亂數就好
			int rand = (int)(Math.random() * 6) + 1; // 產生1-6的亂數
			p[rand]++;
		}
		
		for (int i =1; i <= 6; i++) {
			// 這裡p[i]陣列中括號裡面是放i,原因是上面陣列中括號裡的變數rand是宣告在上面for迴圈裡面的區域變數，所以目前的這個迴圈區塊裡拿不到
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}
		if (p[0] > 0) {
		System.out.printf("錯誤點數出現%d次\n", p[0]);
		}
		
	}
}
