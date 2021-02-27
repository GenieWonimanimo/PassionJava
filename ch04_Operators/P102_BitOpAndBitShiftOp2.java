package ch04_Operators;

class P102_BitOpAndBitShiftOp2 {
	public static void main(String[] args) {
		int n = 15678;
		System.out.println("***오른쪽 끝에서***");
		System.out.println("세번째 비트: " + ((n >> 2) & 1));
		System.out.println("다섯번째 비트: " + ((n >> 4) & 1));
	}
}
