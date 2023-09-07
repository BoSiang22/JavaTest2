package exercise;

public class FastEater implements Runnable {
	int count = 1;
	Thread thread;
	
	public FastEater(String name) {
		thread = new Thread(this, name);
		thread.start();
		
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(count <= 10 ) {
			System.out.println(name + "吃第" + count + "碗飯");
			count++;
			int random = (int) (Math.random() * 2501) + 500;
			try {
				Thread.sleep(random);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		FastEater dindin = new FastEater("饅頭人");
		FastEater james = new FastEater("詹姆士");
		
		try {
			dindin.thread.join();
			james.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束!-----");
	}
	
	
	
}
