package exercise;

import java.math.BigInteger;
import java.util.*;


public class Hw8_1 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//使用Iterator
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//使用傳統for迴圈
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		//使用for each
		for (Object obj: list) {
			System.out.println(obj);
		}
		
		//移除不是java.lang.Number相關的物件
		for(int i = 0; i < list.size();) {
			Object obj = list.get(i);
			if(!(obj instanceof Number)) {
				list.remove(obj);
			} else {
				i++;
			}
		}
		
		//再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
}
