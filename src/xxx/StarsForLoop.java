package xxx;

public class StarsForLoop {
	public static void main(String[] args) {
		// 縱軸和橫軸都從 一加到五顆星星 (二維結構) 所以用 巢狀for迴圈來解
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// 注意內層for迴圈的星星* print我們是不換行的
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
