package ch08.book.exercise.p3;

public class SoundableExample {
	private static void  printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Cat implements Soundable {
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
}








