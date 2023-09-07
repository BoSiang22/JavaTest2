package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.Math;

// 題目: 每次執行都能隨機得到6個不重複的數字介於1~49之間
public class TestCollection {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6){
			int r = (int)(Math.random() * 49) + 1;
			set.add(r);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
