
public class P257_StringConcat {
	public static void main(String[] args) {
		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		// "AB".concat(st1) 으로 인스턴스 하나가 생성된 후 concat(st2)로 다시 하나의 인스턴스를 만든다.
		// 이러한 인스턴스의 빈번한 생성은 자바의 성능에 좋지 않은 영향을 준다.
		String st5 = "AB".concat(st1).concat(st2);
		System.out.println(st5);
	}
}
