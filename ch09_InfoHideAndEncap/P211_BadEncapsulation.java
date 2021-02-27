package ch09_InfoHideAndEncap;

class P211_sv {
	void take() {
		System.out.println("콧물");
	}
}

class P211_snz {
	void take() {
		System.out.println("재채기");
	}
}

class P211_snf {
	void take() {
		System.out.println("코뻥");
	}
}

class P211_CP {
	void takeSv(P211_sv cap) {
		cap.take();
	}
	void takeSnz(P211_snz cap) {
		cap.take();
	}
	void takeSnf(P211_snf cap) {
		cap.take();
	}
}

public class P211_BadEncapsulation {
	public static void main(String[] args) {
		P211_CP suf = new P211_CP();
		
		// 콧물 캡슐 구매 후 복용
		suf.takeSv(new P211_sv());
		// 재채기 캡슐 구매 후 복용
		suf.takeSnz(new P211_snz());
		// 코막힘 캡슐 구매 후 복용
		suf.takeSnf(new P211_snf());
	}
}
