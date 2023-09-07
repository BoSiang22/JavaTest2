package xxx;

public class Test4Number {
	public static void main(String[] args) {

		for (int count = 0; count <= 100; count++) {
			if (count % 4 == 0) {
				System.out.println(count);
			}
			System.out.println();

			// 下面for迴圈等於上面的for迴圈寫法
			for (int i = 0; i <= 100; i += 4)
				System.out.println(i);
		}
	}
}
