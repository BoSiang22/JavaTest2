package exercise;

import java.util.*;

public class TestTrain {
	public static void main(String[] args) {
		// 在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
		
		Train[] trainArray = new Train[7];
		trainArray[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		trainArray[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		trainArray[2] = new Train(118, "自強", "高雄", "台北", 500);
		trainArray[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		trainArray[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trainArray[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		trainArray[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		
		System.out.println("印出不重複的Train物件");
		
		Set<Train> aSet = new HashSet<Train>();
		for (int i = 0; i < trainArray.length; i++) {
			aSet.add(trainArray[i]);
		}
		
		for (Train a: trainArray) {
			System.out.println(a.display());
		}
		
		System.out.println("=====================================");
		System.out.println("讓Train物件印出時，能以班次編號由大到小印出");
		
		List<Train> bList = new ArrayList<Train>();
		for (int i = 0; i < trainArray.length; i++) {
			bList.add(trainArray[i]);
		}
		Collections.sort(bList);
		
		for(int i = 0; i < bList.size(); i++) {
			System.out.println(bList.get(i).display());
		}
		
		System.out.println("=====================================");
		System.out.println("承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件");
		
		//使用TreeSet建構子 TreeSet(collection<? extends E> c) 包裹上面第一題宣告的Set型別Hashset物件參考 aSet
		Set<Train> trainTreeSet = new TreeSet<Train>(aSet);
		Iterator<Train> it = trainTreeSet.iterator();
		while(it.hasNext()) {
			System.out.println(((Train)(it.next())).display());
			
		}
		
	}
	
}
