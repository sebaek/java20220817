package ch13.book.exercise.p2;

public class Container<T> {
	private T v;

	public void set(T o) {
		v = o;
	}
	
	public T get() {
		return v;
	}
}
