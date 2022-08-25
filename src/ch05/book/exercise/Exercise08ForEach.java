package ch05.book.exercise;

public class Exercise08ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		double cnt = 0;
		for (int[] item : array) {
			for (int e : item) {
				sum += e;
				cnt++;
			}
		}
		
		avg = sum / cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}






