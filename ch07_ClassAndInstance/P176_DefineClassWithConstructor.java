package ch07_ClassAndInstance;

class P176_TR {
	int base;
	int height;
	
	public P176_TR(int b, int h) {
		base = b;
		height = h;
	}
	public int changeBase(int b) {
		return base = b;
	}
	public int changeHeight(int h) {
		return height = h;
	}
	public double getArea() {
		return base * height / 2.0;
	}
	public void printInfo() {
		System.out.println("밑변: " + base);
		System.out.println("높이: " + height);
		System.out.println("넓이: " + getArea());
	}
}

public class P176_DefineClassWithConstructor {
	public static void main(String[] args) {
		P176_TR tr = new P176_TR(3, 5);
		tr.printInfo();
		tr.changeBase(5);
		tr.changeHeight(7);
		tr.printInfo();
	}
}
