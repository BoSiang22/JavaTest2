package xxx;

public class AniTest {
	public static final int DOG = 0;
	public static final int BIRD = 1;
	public static final int CAT = 2;
	private String name;
	private int type;
	
	public AniTest(String name, int type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public void show() {
		System.out.println("名字: " + name);
		System.out.println("種類: " + type);
	}
	
	
	
}
