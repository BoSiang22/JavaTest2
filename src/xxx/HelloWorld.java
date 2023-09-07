package xxx;

// 用來測試和練習用的JAVA類別
public class HelloWorld { 
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(9));
		System.out.println(Math.ceil(35.2));
		System.out.println("=============");
		System.out.println(Math.floor(35.2));
		System.out.println(Math.round(29.1));
		
		double x = Math.rint(23.5);
		System.out.println(x);
		
		System.out.println("---------------");
		
		// 求 整數 1~60 的亂數
		int y = (int)(Math.random() * 60) + 1;
		// 印出上面 y 的整數亂數
		System.out.println(y);
		
		
		System.out.println("---------------");
		
		
		
		
		
		
		
	}
}
