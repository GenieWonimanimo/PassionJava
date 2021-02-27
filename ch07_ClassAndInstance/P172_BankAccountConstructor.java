package ch07_ClassAndInstance;

class P172_BA {
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance = 0; // 잔고
	
	public P172_BA(String acc, String ss, int bal) { // 생성자
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

class P172_BankAccountConstructor {
	public static void main(String[] args) {
		P172_BA yoon = new P172_BA("12-34-89", "990990-9090990", 10000);
		yoon.deposit(5000);
		yoon.withdraw(2000);
		yoon.checkMyBalance();
	}
}
