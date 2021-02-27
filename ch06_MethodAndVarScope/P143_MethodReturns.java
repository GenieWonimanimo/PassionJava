package ch06_MethodAndVarScope;

class P143_MethodReturns {
	public static void main(String[] args) {
		System.out.println("4 + 5 = " + adder(4, 5));
		System.out.println("3.5 * 3.5 = " + square(3.5));
	}
	
	public static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	public static double square(double n) {
		return n * n;
	}
}
