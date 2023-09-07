package xxx;

public class ExerciseArray3 {
	public static void main(String[] args) {
		// 二維陣列的介紹
		// 多維陣列 就是 一維陣列中 還有一維陣列中 還有 一維陣列....
		int[][] arr1 = new int[3][4]; // 3 x 4, 二維陣列的口令: 一維陣列中 含有 一維陣列
		System.out.println(arr1[0][3]);
		System.out.print("arr1陣列的長度:");
		System.out.println(arr1.length); // arr1陣列的元素長度 (長度等於有幾個元素)
		System.out.println(arr1[0].length); // arr1陣列裡面的第0個元素它裡面的一維陣列長度為多少
		System.out.println(arr1[1].length); // arr1陣列裡面的第1個元素........
		System.out.println(arr1[2].length); // arr1陣列裡面的第2個元素它裡面的一維陣列長度為多少
		
		int[][] arr2 = new int[3][]; // 3 x ?
		arr2[0] = new int[2];
		arr2[1] = new int[2];
		arr2[2] = new int[1];
		
		System.out.println(arr2.length); // arr2陣列裡面有幾個元素
		System.out.println(arr2[0].length); // 問arr2一維陣列的元素0底下有幾個元素
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
		System.out.println(arr2[2][0]);
		System.out.println(arr2[1][1]);
		// 3 x ?
	}
}
