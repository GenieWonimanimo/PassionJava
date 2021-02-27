package ch07_ClassAndInstance;

class P162_BankAccount {
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

class P162_BankAccountOO {
	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		P162_BankAccount yoon = new P162_BankAccount();
		P162_BankAccount park = new P162_BankAccount();
		
		// 각 인스턴스 대상으로 예금 진행
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스 대상으로 출금 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// 각 인스턴스 대상으로 잔액 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
