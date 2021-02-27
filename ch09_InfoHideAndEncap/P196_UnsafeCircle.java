package ch09_InfoHideAndEncap;

class P196_Circle {
	double rad = 0; // 원의 반지름
	final double PI = 3.14;
	
	public P196_Circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getArea() {
		return rad * rad * PI;
	}
}

public class P196_UnsafeCircle {
	public static void main(String[] args) {
		P196_Circle c = new P196_Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);;
		System.out.println(c.getArea());
		c.rad = -4.5; // 옳지 않은 접근 방법, 그리고 문제가 되는 부분
		System.out.println(c.getArea());
	}
}
