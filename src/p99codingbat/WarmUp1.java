package p99codingbat;

public class WarmUp1 {
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		int diff = 21 - n;

		return (diff < 0) ? diff * -2 : diff;
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

}
