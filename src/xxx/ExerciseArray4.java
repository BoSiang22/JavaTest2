package xxx;

public class ExerciseArray4 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //單位為千分之一秒
		
		/* 題目: 撲克牌總共有52張牌，每張牌獨立不會有重複，等下會進行洗牌的動作，並發到四個玩家手上，
		 * 		求各個玩家排各式多少
		 * 資訊相關科系的方法: 先求52個亂數 0~51，然後取出一張牌，亂數變51個，之後重複此動作，直到牌發完
		 * 但趙令文老師的解法不同: 用直觀的方式去解題，以下為她的解法
		 */
		int[] poker = new int[52]; //陣列裡面index是 0-51 實做出來，目前值[0-51]都為0，只要先宣告出這副牌的空間出來就可以了
		
		for(int i=0; i < poker.length; i++) {
			int temp = (int)(Math.random() * 52); //先把亂數1-52放到temp變數這個佔存的地方保留，
												  //產出來temp後再往前比對之前已經產生出來的數字，目的是為了不要取重複的值	
			// 進行檢查牌數字是否重複
			boolean isRepeat = false;
			for (int j = 0; j<i; j++) {
				// poker[j] 它的索引值也是從零開始 0~50, 因為是往前比對 poker[i]的值，所以比到倒數第二張就好了，
				// 但這裡是宣告temp變數還沒將值放進poker[i]裡，也就是poker[i]還沒宣告出來
				// 因為最後一張牌一定不會重複了，poker[i]跟poker[j] i跟j索引值會是一樣的代表求的元素是同一個，只是確認值有沒重複而已
				if (temp == poker[j]) {
					isRepeat = true;
					break;
				}
			}	
			if (isRepeat) {
				i--; // 因為上面的isRepeat代表true,所以會直接跳離迴圈，我們也不會放值到poker[i]裡面，值也就少一次了
					 // 所以這裡i-- 故意減一次，這樣跑到最上面i的for迴圈，在i++回來的話，就等於重複跑同一次的i值的迴圈了
			} else {
				poker[i] = temp;
			}
		}
		
		for (int card : poker) {
			System.out.println(card);
		}
		
		System.out.println("===========");
		System.out.println(System.currentTimeMillis()- start);
		
	}
}
