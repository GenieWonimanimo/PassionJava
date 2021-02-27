package ch07_ClassAndInstance;

class P165_BankAccount {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}
}

public class P165_PassingRef {
	public static void main(String[] args) {
		P165_BankAccount ref = new P165_BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref); // 참조 값의 전달
		
		ref = null; // ref가 참조하는 인스턴스와의 관계를 끊음
		if (ref == null)
			System.out.println("관계가 끊겼습니다.");
	}
	
	public static void check(P165_BankAccount acc) {
		acc.checkMyBalance();
	}
}
