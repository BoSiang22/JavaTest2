package xxx;



public class Hw5_3 {
	
	public int maxElement(int x[][]) {
		int maxNum = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	
	public double maxElement(double x[][]) {
		double maxNum = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	
	
	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		Hw5_3 a = new Hw5_3();
		System.out.println(a.maxElement(intArray));
		System.out.println(a.maxElement(doubleArray));
		
		
	}
}

