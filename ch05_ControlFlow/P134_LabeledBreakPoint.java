package ch05_ControlFlow;

class P134_LabeledBreakPoint {
	public static void main(String[] args) {
outer:  for (int i = 1; i < 10; i++) { // 바깥쪽 for문에 레이블 outer 명시
			for (int j = 1; j < 10; j++) {
				if ((i * j) == 72) {
					System.out.println(i + " x " + j + " = " + i * j);
					break outer;
				}
			}
		}
	}
}
