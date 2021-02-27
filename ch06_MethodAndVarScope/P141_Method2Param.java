package ch06_MethodAndVarScope;

class P141_Method2Param {
	public static void main(String[] args) {
		double myHeight = 175.9;
		HiEveryone(12, 12.5);
		HiEveryone(13, myHeight);
		ByEveryone();
	}
	
	public static void HiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}
	
	public static void ByEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
}
