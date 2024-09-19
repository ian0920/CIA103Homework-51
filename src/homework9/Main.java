package homework9;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
//		question1();
		BankAccount a = new BankAccount(0);
		ATMmom mom = new ATMmom(a);
		ATMkids kid = new ATMkids(a);
		
		mom.start();
		kid.start();
		
		while (true) {
			
			if( ATMkids.isFinished && mom.isAlive() ) {
				mom.interrupt();
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (ATMkids.isFinished && !mom.isAlive()) {
				break;
			}
			
			
		}

		
	}
	
	public static void question1() {
		
		System.out.println("-----大胃王快食比賽開始-----");
				
				Eat e1 = new Eat("詹姆士");
				Eat e2 = new Eat("饅頭人");
		
				e1.start();
				e2.start();
				
				try {
					e1.join();
					e2.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("-----大胃王快食比賽結束-----");
		
	}
	
	
	

}

class Eat extends Thread{
	
	private String name;
	
	public Eat(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int start = 1;
		while (start <= 10) {
			System.out.println(name + "吃第" + start + "碗飯");
			start++;
			
			try {
				Random r = new Random();
				Thread.sleep(r.nextInt(500, 3001));
			} catch  (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class BankAccount {
	
	
	private int amount;
	public BankAccount(int amount) {

		this.amount = amount;
	}
	
	synchronized public void withdraw(int money) {

		while(amount < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println( "熊大被老媽告知帳戶已經有錢!");
		} 
				
		amount -= money;
		System.out.println("熊大領了" + money +"，帳戶共有： " + amount);
		
		if(amount <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}


		
	}
	
	synchronized public void deposit(int money) {
		
		while (amount > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println("媽媽可以結束匯款惹～");
				return;
			}
		}
		

			amount += money;			
			System.out.println("媽媽存了" + money + "帳戶共有： " + amount);
			notify();
		
		
		
	}
	
	
}

class ATMmom extends Thread{
	
	private BankAccount account;
	
	public ATMmom(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		
		for (int i = 0; i <= 10; i++) {
			account.deposit(2000);
		}
		
	}	
}

class ATMkids extends Thread{
	
	private BankAccount account;
	public static boolean isFinished = false;
	
	public ATMkids(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			account.withdraw(1000);
		}
		
		isFinished = true; 
		
				
	}	
}
