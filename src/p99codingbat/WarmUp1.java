package p99codingbat;

public class WarmUp1 {
	public boolean nearHundred(int n) {

		return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
	}

	public boolean makes10(int a, int b) {
		int sum = a + b;

		if (sum == 10) {
			return true;
		} else {
			return (a == 10) || (b == 10);
		}

	}

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
