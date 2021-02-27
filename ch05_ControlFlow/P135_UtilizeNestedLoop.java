package ch05_ControlFlow;

class P135_UtilizeNestedLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int ij = 10 * i + j;
				int ji = 10 * j + i;
				if (ij + ji == 99)
					System.out.println("[" + i + ", " + j + "]");
			}
		}
	}
}
