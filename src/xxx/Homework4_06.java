package xxx;

import java.util.Arrays;

public class Homework4_06 {
	public static void main(String[] args) {
		
		int scores[][] = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,70,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		
		int[] students = new int[8];
		for(int i = 0; i < scores.length; i++) {
			int[] a = Arrays.copyOf(scores[i], scores[i].length);
			Arrays.sort(a);
			int h = a[a.length-1];
			for(int j = 0; j < students.length; j++) {
				if(scores[i][j] == h) {
					students[j] += 1;
				}
			}
		}
		for (int k = 0; k < students.length; k++) {
		System.out.println("每位同學考最高分的次數分別為: " + students[k] + " ");
		}
	}
	
}
