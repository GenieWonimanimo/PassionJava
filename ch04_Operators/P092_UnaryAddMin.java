package ch04_Operators;

class P092_UnaryAddMin {
	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		short num3 = (short)(+num2); // 형 변환 하지 않으면 오류 발생
		short num4 = (short)(-num2); // 형 변환 하지 않으면 오류 발생
		System.out.println(num3);
		System.out.println(num4);
	}
}
