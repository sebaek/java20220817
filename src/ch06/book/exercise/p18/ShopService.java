package ch06.book.exercise.p18;

public class ShopService {
	private static ShopService ins;
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		if (ins == null) {
			ins = new ShopService();
		}
		
		return ins;
	}
}
