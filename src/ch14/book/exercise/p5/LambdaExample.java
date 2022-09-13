package ch14.book.exercise.p5;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10, 50, 3};
	public static void main(String[] args) {
		// lambda
//		int max = maxOrMin((x, y) -> Math.max(x, y));
		
		// 익명 클래스 객체를 바로 파라미터로 전달
		/*
		int max = maxOrMin(new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {

				return Math.max(left, right);
			}
			
		});
		*/
		
		// 익명 클래스 객체를 지역변수로 할당 후 파라미터에 전달
		/*
		IntBinaryOperator op = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return Math.max(left, right);
			}
		};
		int max = maxOrMin(op);
		*/
		
		// 이름 있는 클래스 만들고 객체 만들고 파라미터에 전달
		class MaxOperator implements IntBinaryOperator {
			@Override
			public int applyAsInt(int left, int right) {
				return Math.max(left, right);
			}
		}
		
		IntBinaryOperator op = new MaxOperator();
		int max = maxOrMin(op);
		
		System.out.println("최대값:" + max);
		
		int min = maxOrMin((x, y) -> Math.min(x, y));
		
		System.out.println("최소값:" + min);
	}

	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		
		return result;
	}
}


