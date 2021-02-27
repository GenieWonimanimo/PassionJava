package ch09_InfoHideAndEncap;

class P216_P {
	int xPos, yPos;
	public P216_P(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class P216_C {
	P216_P p;
	int rad;
	public P216_C(int x, int y, int r) {
		p = new P216_P(x, y);
		rad = r;
	}
	public void showCircleInfo() {
		p.showPointInfo();
		System.out.println("rad: " + rad);
	}
}

public class P216_DefineVariousClass {
	public static void main(String[] args) {
		P216_C c = new P216_C(2, 2, 4);
		c.showCircleInfo();
	}
}
