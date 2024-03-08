package work_0307;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance <= MIN_BALANCE || balance >= MAX_BALANCE) balance = 0;
		else this.balance = balance;
	}
	public static int getMinBalance() {
		return MIN_BALANCE;
	}
	public static int getMaxBalance() {
		return MAX_BALANCE;
	}
}
