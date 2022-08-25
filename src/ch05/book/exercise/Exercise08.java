package ch05.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		double cnt = 0;
		int allLength = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
			allLength += array[i].length;
		}
		
		avg = sum / cnt;
		
		System.out.println(sum / (double) allLength);
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		
	}
}




