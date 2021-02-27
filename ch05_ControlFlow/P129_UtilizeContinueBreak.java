package ch05_ControlFlow;

class P129_UtilizeContinueBreak {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (true) {
			sum += n;
			if (sum >= 1000) break;
			n += 2;
		}
		System.out.println(sum + " " + n);
	}
}
