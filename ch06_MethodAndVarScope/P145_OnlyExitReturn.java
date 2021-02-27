package ch06_MethodAndVarScope;

class P145_OnlyExitReturn {
	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
	
	public static void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: " + (n1 / n2));
	}
}
