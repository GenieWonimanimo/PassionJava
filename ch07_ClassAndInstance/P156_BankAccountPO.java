package ch07_ClassAndInstance;

class P156_BankAccountPO {
	static int balance = 0;
	
	public static void main(String[] args) {
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}
	
	public static int deposit(int amount) { // 입금 담당 메소드
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount) { // 출금 담당 메소드
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance() { // 예금 조회 담당 메소드
		System.out.println("잔액: " + balance);
		return balance;
	}
}
