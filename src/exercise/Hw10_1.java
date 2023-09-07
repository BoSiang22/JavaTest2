package exercise;

public class Hw10_1 {
	public static void main(String[] args) {
		int num = 0;
		boolean primeNum;
		for(int i = 0; i <= 5; i++) {
			num = (int)(Math.random()*100) + 1;
			primeNum =  isPrime(num);
			if(primeNum == true) {
				System.out.println(num + "是質數");
			} else {
				System.out.println(num + "不是質數");
			}
			
		}

	}
	
	public static boolean isPrime(int num){
		if (num < 2) {
			return false;
		} else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				} 
			}
		}
		return true; 
	}
}
