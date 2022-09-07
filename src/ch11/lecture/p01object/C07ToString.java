package ch11.lecture.p01object;

public class C07ToString {
	public static void main(String[] args) {
		Object a = new Computer("lg", 32, 4, 300);
		Computer b = new Computer("ss", 64, 8, 500);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println(String.valueOf(b));
		System.out.println(b);
	}
}

class Computer {
	private String model;
	private int ssd;
	private int ram;
	private int power;

	public Computer(String model, int ssd, int ram, int power) {
		super();
		this.model = model;
		this.ssd = ssd;
		this.ram = ram;
		this.power = power;
	}

	// toString : 객체를 문자열(text)로 표현하기 위한 메소드
	@Override
	public String toString() {
		return "Computer [model=" + model + ", ssd=" + ssd + ", ram=" + ram + ", power=" + power + "]";
	}


}






