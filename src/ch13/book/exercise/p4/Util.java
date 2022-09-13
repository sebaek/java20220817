package ch13.book.exercise.p4;

public class Util {
	public static <K, V> V getValue(Pair<? extends K, ? extends V> pair, K key) {
		if (pair.getKey().equals(key)) {
			return pair.getValue();
		}
		
		return null;
	}
}
