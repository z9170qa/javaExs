package blackJack;

public class BlackJack {

	public int Blackj(int a, int b) {
	
		if (a > 21 & b > 21) {
			return 0;
		}
		else if (b > 21) {
			return a;
		}
		else if (a > 21) {
			return b;
		}
		else if (a < b) {
			return b;
		}
		else if (b < a) {
			return a;
		}
		else if (b == 0) {
			return a;
		}
		else if (a == 0) {
			return b;
		} else {
			return 0;
		}
	
	}
}
