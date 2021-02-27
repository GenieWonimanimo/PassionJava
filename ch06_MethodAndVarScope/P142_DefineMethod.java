package ch06_MethodAndVarScope;

class P142_DefineMethod {
	public static void main(String[] args) {
		Diff(3, 5);
	}
	
	public static void Diff(int a, int b) {
		if (a > b)
			System.out.println(a - b);
		else
			System.out.println(b - a);
	}
}
