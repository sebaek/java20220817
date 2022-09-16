package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C04Comparator {
	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<>((b1, b2) -> b2.getPrice() - b1.getPrice());
		books.add(new Book("java", 1000));
		books.add(new Book("css", 500));
		books.add(new Book("jsp", 700));
		
		System.out.println(books);
		
		System.out.println(books.first());
		System.out.println(books.last());
	}
}

class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ":" + price;
	}
}



