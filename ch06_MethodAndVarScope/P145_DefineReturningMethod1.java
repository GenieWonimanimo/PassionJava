package ch06_MethodAndVarScope;

class P145_DefineReturningMethod1 {
	public static void main(String[] args) {
		int r = 5;
		System.out.println("원의 둘레: " + GetRound(r));
		System.out.println("원의 넓이: " + GetArea(r));
	}
	
	public static double GetRound(int r) {
		return 2 * 3.141592 * r;
	}
	public static double GetArea(int r) {
		return 3.141592 * r * r;
	}
}
