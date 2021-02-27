package ch06_MethodAndVarScope;

class P154_DefineRecurMethod1 {
	public static void main(String[] args) {
		System.out.println(Pow(10));
	}
	
	public static int Pow(int n) {
		if (n == 1)
			return 2;
		else
			return 2 * Pow(n - 1);
	}
}
