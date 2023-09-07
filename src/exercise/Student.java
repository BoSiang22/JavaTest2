package exercise;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score -= hours;
	}
	
	public void study(int hours) {
		score += hours;
	}
	
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.play(2);
		st2.study(2);
		
		System.out.println(st1.score);
		System.out.println(st2.score);
	}
}
