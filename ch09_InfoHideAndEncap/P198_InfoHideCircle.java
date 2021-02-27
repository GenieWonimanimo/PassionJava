package ch09_InfoHideAndEncap;

class P198_C  {
	private double rad = 0;
	final double PI = 3.14;
	public P198_C(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return rad * rad * PI;
	}
}

public class P198_InfoHideCircle {
	public static void main(String[] args) {
		P198_C c = new P198_C(1.5);
		System.out.println("반지름: " + c.getRad());
		System.out.println("넓이: " + c.getArea());
	}
}
