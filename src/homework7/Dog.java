package homework7;

import java.io.Serializable;

public class Dog implements Serializable{
	private String name;
	private static final long serialVersionUID = 1L;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
