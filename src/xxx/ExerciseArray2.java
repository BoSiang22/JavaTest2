package xxx;

/* 網路的題目:(以陣列方式呈現)
擲骰子1000次，統計看看點數1~6個出現幾次，但是4~6點的產生次數為1~6點的兩倍 (所以程式要寫出一個作弊的骰子),
注意: 陣列元素不用增加，因為新增7~9點會被算到4~6點身上，下面p[rand]那行有解釋
*/ 
public class ExerciseArray2 {
	public static void main(String[] args) {
		//連零點的陣列也宣告出來所以是0~6點,共7個點數
		int[] p = new int[10];
		
		for(int i=0; i<1000; i++) {
			//雖然我們有宣告出0點的陣列，但是產生亂數時我們不要它所以最後加1,求 1~6 點的亂數就好
			int rand = (int)(Math.random() * 9) + 1; //產生1-9的亂數
			// 123456點不變， 但是下面我們會將7,8,9 => 調整 7-3 => 變4點, 8-3 => 變5點, 9-3 => 變6點
			p[rand >= 7 ? rand-3: rand]++; // 使用三元運算，這是一個簡略的 if-else敘述。  ?: 為三元運算子
			// 三元運算式:  (boolean) ? value1(true) : value2(false) => value1 or value2
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
