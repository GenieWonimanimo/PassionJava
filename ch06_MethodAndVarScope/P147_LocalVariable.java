package ch06_MethodAndVarScope;

class P147_LocalVariable {
	public static void main(String[] args) {
		boolean ste = true;
		int num1 = 11;
		
		if (ste) {
			//int num1 = 22; // 주석 해제시 오류 발생
			num1++;
			System.out.println(num1);
		}
		
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		//System.out.println(num2); // 주석 해제시 오류 발생
	}
}
