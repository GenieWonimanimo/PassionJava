
public class P237_ClassVarAndClassMethod {
	static int sum = 0;
	static void add(int n) {
		sum += n;
	}
	static void showResult() {
		System.out.println("sum = " + sum);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) 
			P237_ClassVarAndClassMethod.add(i);
		P237_ClassVarAndClassMethod.showResult();
	}
}
