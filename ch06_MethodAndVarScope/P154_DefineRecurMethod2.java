package ch06_MethodAndVarScope;

class P154_DefineRecurMethod2 {
	public static void main(String[] args) {
		DecToBi(0b11001011);
	}
	
	public static void DecToBi(int n) {
		if (n == 1)
			System.out.print(1);
		else {
			DecToBi(n >> 1);
			System.out.print(n & 1);
		}
	}
}
