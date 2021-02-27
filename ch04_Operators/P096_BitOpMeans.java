package ch04_Operators;

class P096_BitOpMeans {
	public static void main(String[] args) {
		byte n1 = 13; // 00001101
		byte n2 = 7;  // 00000111
		byte n3 = (byte)(n1 & n2); // n1 & n2 의 연산결과는 int형
		System.out.println(n3);
	}
}
