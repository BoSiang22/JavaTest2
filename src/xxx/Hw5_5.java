package xxx;


public class Hw5_5 {
	public void genAuthCode() {
		int[] randomCode =new int[8];
		int a;
		for (int i = 0; i < randomCode.length; i++) {
			while(true) {
			a = (int)(Math.random()*75)+48;
			if ((47 < a && a < 58) || (64 < a && a < 91) || (96 < a && a < 123)) {
				randomCode[i] = a;
				System.out.print((char)randomCode[i]);
				break;
			}
			} 
		}
	}

	public static void main (String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		Hw5_5 x= new Hw5_5();
		x.genAuthCode();
	}
	
}
