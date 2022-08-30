package ch06.book.exercise.p19;

public class Account {
	private static final int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;
	private int balance;
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	

}
