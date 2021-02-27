package ch05_ControlFlow;

class P121_DoWhileBasic {
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("I like Java " + num++);
		} while (num < 5);
	}
}
