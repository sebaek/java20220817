package ch06.lecture.p10answer;

import java.util.Arrays;

import ch06.book.exercise.p20.Account;

public class Test1 {
	static int[] arr = new int[3];
	static Account[] accountArray = new Account[3];
	
	public static void main(String[] args) {
		addNumber();
		System.out.println(Arrays.toString(arr));
		
		addAccount();
		System.out.println(Arrays.toString(accountArray));
	}
	
	private static void addAccount() {
		Account a = new Account("3", "3", 3);
		System.out.println(System.identityHashCode(a));
		accountArray[0] = a;
	}
	
	private static void addNumber() {
		arr[2] = 100;
	}
}







