package xxx;

public class ExerciseArray6 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //單位為千分之一秒
		
		/* 題目: 撲克牌總共有52張牌，每張牌獨立不會有重複，等下會進行洗牌的動作，並發到四個玩家手上，
		 * 		求各個玩家排各式多少
		 * 資訊相關科系的方法: 先求52個亂數 0~51，然後取出一張牌，亂數變51個，之後重複此動作，直到牌發完
		 * 但趙令文老師的解法不同: 用直觀的方式去解題，以下為她的解法
		 */
		
		// 用for while迴圈的寫法 寫洗牌的動作
		int[] poker = new int[52]; //陣列裡面index是 0-51 實做出來，目前值[0-51]都為0，只要先宣告出這副牌的空間出來就可以了
		
		boolean isRepeat;
		int temp;
		for(int i=0; i < poker.length; i++) {
			do {
				temp = (int)(Math.random() * 52);
				// 進行檢查牌數字是否重複
				isRepeat = false;
				for (int j = 0; j<i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}
				}	
			}while(isRepeat);
			poker[i] = temp;
		}
		
		for (int card : poker) {
			System.out.println(card);
		}
		
		System.out.println("===========");
		System.out.println(System.currentTimeMillis()- start); //執行花的秒數
		
	}
}
