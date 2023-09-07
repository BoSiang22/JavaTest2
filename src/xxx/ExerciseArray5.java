package xxx;

import java.util.Arrays;

public class ExerciseArray5 {
	public static void main(String[] args) {
		
		/* 題目: 撲克牌總共有52張牌，每張牌獨立不會有重複，等下會進行洗牌的動作，並發到四個玩家手上，
		 * 		求各個玩家排各式多少
		 * 資訊相關科系的方法: 先求52個亂數 0~51，然後取出一張牌，亂數變51個，之後重複此動作，直到牌發完
		 * 但趙令文老師的解法不同: 用直觀的方式去解題，以下為她的解法
		 */
		
		// 用for while迴圈的寫法 寫洗牌的動作，寫完迴圈語法後，開始寫發牌的程式碼
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
		
		//先做洗牌的動作
		for (int card : poker) {
			System.out.println(card);
		}
		
		System.out.println("===========");
		//上面洗完牌後，接下來寫發牌給四個玩家的程式碼
		
		// 宣告一個二維陣列，代表牌發給 4 個玩家，每個玩家有 13 張牌
		int[][] players = new int[4][13];
		// i為牌一張一張的拿出來發給玩家
		for (int i =0; i < poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		System.out.println("以下為發牌給玩家0的動作");
		// 將玩家0的十三張牌顯示出來
		for (int card : players[0]) {
			System.out.println(card);
		}
		
		//將每個玩家的牌用成一列顯示出來
		
		for (int[] player : players) {
			for (int card : player) {
				System.out.print(card + " ");
			}
			System.out.println();
		}
		
		// 將每張牌的數字顯示為各個花色:
		// 0 - 12 => 黑桃 
		// 13 - 25 => 紅心
		// 26 - 38 => 方塊
		// 39 - 51 => 梅花
		// 牌玩花色後按照牌的大小排序 使用Java API Arrays類別裡的sort()方法來排序
		
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8"
				          ,"9", "10", "11", "12", "13"};
		for (int[] player : players) {
			Arrays.sort(player);
			for (int card : player) { // card的值是 0 ~ 51
				System.out.print(suits[card / 13] + values[card % 13] +" ");
			}
			System.out.println();
		}
	}
}
