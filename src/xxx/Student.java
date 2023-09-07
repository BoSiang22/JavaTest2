package xxx;

public class Student {
	int score = 90;

	// 每休息一個小時，score就會減1
	public void play(int hours) {
		score -= hours;
	}

	// 每休息一個小時，score就會加1
	public void study(int hours) {
		score += hours;
	}

	public static void main(String[] args) {
		Student ppl1 = new Student();
		Student ppl2 = new Student();
		/*
		 * 呼叫物件方法、並給予物件方法參數值，不過這幾個物件方法沒有輸出的程式碼在裡面
		 * 所以不會直接輸println出成績score分數，需要自己寫出輸出物件屬性score的程式碼
		 */
		ppl1.play(2);
//		ppl1.study(6);
		ppl2.play(10);
//		ppl2.study(5);

		System.out.println(ppl1.score);
		System.out.println(ppl2.score);

	}
}
