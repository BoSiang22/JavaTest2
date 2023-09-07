package xxx;

import java.util.Scanner;

public class Homework404 {
	public static void main(String[] args) {
		int[][] people = { {25, 32, 8, 19, 27}, 
						   {2500, 800, 500, 1000, 1200}
						 };
		Scanner sc = new Scanner(System.in);
		System.out.println("你想借多少錢: ");
		int money = sc.nextInt();
		System.out.print("員工編號: ");
		int sum = 0;
		for (int i = 0; i < people[0].length; i++) {
			if (people[1][i] > money) {
				System.out.print(people[0][i]+" ");
				sum++;
			}
		}
		System.out.print("共" + sum + "人");
	}
}
