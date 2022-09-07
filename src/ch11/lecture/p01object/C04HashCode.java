package ch11.lecture.p01object;

public class C04HashCode {
	public static void main(String[] args) {
		// equals로 true가 나왔다면
		// hashcode의 값이 같아야 함
		
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
		
		Object o3 = new Book(99);
		Object o4 = new Book(99);
		
		System.out.println(o3.equals(o4)); // true
		
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
	}
}





