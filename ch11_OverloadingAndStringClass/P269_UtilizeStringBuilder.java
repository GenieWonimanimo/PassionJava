
public class P269_UtilizeStringBuilder {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("990925-1012999");
		stb.replace(6, 7, " ");
		System.out.println(stb.toString());
	}
}
