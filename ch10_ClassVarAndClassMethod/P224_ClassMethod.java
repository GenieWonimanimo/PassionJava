
class NumberPrinter {
	private int myNum = 0;
	
	static void showInt(int n) {
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	void showMyNumber() {
		showInt(myNum);
	}
}


public class P224_ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20); // 클래스 이름을 통한 클래스 메소드 호출
		
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);
		np.setMyNumber(75);
		np.showMyNumber();
	}
}
