package ch05_ControlFlow;

class P110_CondOp {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수: " + big);
		
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("차의 절댓값: " + diff);
	}
}