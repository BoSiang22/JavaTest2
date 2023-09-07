package xxx;

public class Hw5_2 {
	
	public static void randAvg() {
		int[] randomNum = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果:");
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int)(Math.random() * 101);
			sum += randomNum[i];
			System.out.print(randomNum[i]+ " ");
			
		}
		System.out.println();
		System.out.println("亂數的平均值:" + sum/10);
	}
	
	public static void main(String[] args) {
		randAvg();
	}
}
