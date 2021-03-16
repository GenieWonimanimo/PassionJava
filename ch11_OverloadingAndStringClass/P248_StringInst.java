
public class P248_StringInst {
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length() + "\n");
		
		System.out.println(str2);
		System.out.println(str2.length() + "\n");
		
		showString("Funny String"); // String 인스턴스 생성 후에 메소드 호출
	}
}
