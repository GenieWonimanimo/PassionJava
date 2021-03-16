
public class P260_CompString {
	public static void main(String[] args) {
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		if (st1.equals(st2))
			System.out.println("equal");
		else
			System.out.println("different");
		
		cmp = st1.compareTo(st2);
		if (cmp == 0)
			System.out.println("equal");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + st1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st2);
		
		if (st1.compareToIgnoreCase(st2) == 0)
			System.out.println("equal");
		else
			System.out.println("different");
	}
}
