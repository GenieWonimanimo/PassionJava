package ch09_InfoHideAndEncap;

class P214_sv {
	void take() {
		System.out.println("콧물");
	}
}

class P214_snz {
	void take() {
		System.out.println("재채기");
	}
}

class P214_snf {
	void take() {
		System.out.println("코뻥");
	}
}

class P214_SnsCap {
	P214_sv svCap = new P214_sv();
	P214_snz snzCap = new P214_snz();
	P214_snf snfCap = new P214_snf();
	
	void take() {
		svCap.take();
		snzCap.take();
		snfCap.take();
	}
}

class P214_CP {
	void takeSns(P214_SnsCap cap) {
		cap.take();
	}
}

public class P214_CompEncapsulation {
	public static void main(String[] args) {
		P214_CP suf = new P214_CP();
		suf.takeSns(new P214_SnsCap());
	}
}
