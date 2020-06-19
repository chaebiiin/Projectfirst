package com.yedam.morning.chap14;

import java.util.function.IntBinaryOperator;

public class LamdaExample_05 {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int maxresult = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				return left > right ? left : right;
			
			}
		});
		System.out.println("최대값은 " + maxresult);
		
		int minresult = maxOrMin(new IntBinaryOperator () {
			
			@Override
			public int applyAsInt(int left, int right) {
				return left < right ? left : right;
			}
		});
		System.out.println("최소값은  " + minresult);
	}
}