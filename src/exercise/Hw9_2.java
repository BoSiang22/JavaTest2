package exercise;


class Account {
	private int balance = 0;
	
	synchronized public void wire(int money) {
		while(balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了" + money + ", 帳戶共有:" + balance);
		notify();
	}
	
	
	synchronized public void withdraw(int money) {
		while (balance <= money) {
			System.out.println("媽媽被熊大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(balance >= 2000){
		        System.out.println("熊大被老媽告知帳戶已經有錢！");
		    }
		}

		balance -= money;
		System.out.println("熊大領了" + money + "，帳戶共有:" + balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}


class Son extends Thread{
	Account account;
		
	public Son(Account account) {
		this.account = account;
	}
		
	public void run() {
		for (int i = 1; i <= 10; i++)
			account.withdraw(1000); 
	}
}
	
class Mom extends Thread{
	Account account;
		
	public Mom(Account account) {
		this.account = account;
	}
		
	public void run() {
		for (int i = 1; i <= 10; i++)
			account.wire(2000); 
	}
}




public class Hw9_2 {
	public static void main(String[] args) {
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
		
	}
}


