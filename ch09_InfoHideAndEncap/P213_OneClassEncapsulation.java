package ch09_InfoHideAndEncap;

class P213_Sns {
	void sniTake() {
		System.out.println("콧물");
	}
	void sneTake() {
		System.out.println("재채기");
	}
	void snuTake() {
		System.out.println("코뻥");
	}
	
	void take() {
		sniTake();
		sneTake();
		snuTake();
	}
}

class P213_CP {
	void takeSns(P213_Sns cap) {
		cap.take();
	}
}

public class P213_OneClassEncapsulation {
	public static void main(String[] args) {
		P213_CP suf = new P213_CP();
		suf.takeSns(new P213_Sns());
	}
}
