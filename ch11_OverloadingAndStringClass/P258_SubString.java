
public class P258_SubString {
	public static void main(String[] args) {
		String st1 = "abcdefg";
		String st2 = st1.substring(2); // 인덱스 2 ~ 끝까지
		String st3 = st1.substring(2, 4); // 인덱스 [2, 4)
		System.out.println(st2 + "\n" + st3);
	}
}
