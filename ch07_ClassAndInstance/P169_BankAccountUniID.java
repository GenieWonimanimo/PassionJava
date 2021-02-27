package ch07_ClassAndInstance;

class P169_BankAccount {
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance = 0; // 잔고
	
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔액: " + balance);
		return balance;
	}
}

public class P169_BankAccountUniID {
	public static void main(String[] args) {
		P169_BankAccount yoon = new P169_BankAccount(); // 계좌 생성
		yoon.initAccount("12-34-89", "990990-9090990", 10000);
		
		yoon.deposit(5000);
		yoon.withdraw(2000);
		yoon.checkMyBalance();
	}
}
