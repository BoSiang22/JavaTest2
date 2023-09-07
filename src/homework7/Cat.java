package homework7;

import java.io.Serializable;

public class Cat implements Serializable {
	private String name;
	private static final long serialVersionUID = 1L;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
