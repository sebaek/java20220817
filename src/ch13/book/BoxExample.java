package ch13.book;

public class BoxExample {
	public static void main(String[] args) {
		/* 656 
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		*/
		
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple a = box2.get();
	}
}






