
public class P267_ReturnStringBuilder {
	public static void main(String[] args) {
		StringBuilder stb1 = new StringBuilder("123");
		StringBuilder stb2 = stb1.append(45678);
		
		System.out.println(stb1.toString());
		System.out.println(stb2.toString());
		
		// 인덱스 0~4 의 문자 삭제
		stb2.delete(0, 5);
		
		System.out.println(stb1.toString());
		System.out.println(stb2.toString());
		
		if (stb1 == stb2)
			System.out.println("equal");
		else
			System.out.println("different");
	}
}
