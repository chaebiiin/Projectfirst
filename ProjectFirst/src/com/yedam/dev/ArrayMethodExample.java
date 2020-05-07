package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {

		int[] intAry = { 1, 2, 3, 4, 5 };
		double[] dobAry = { 1.1, 2.2, 3.3, 4.4 };
		
		int result = sumAry(intAry);
		double result2 = avgAry(dobAry);
		System.out.println("배열 intAry 합  : " + result);
		System.out.println("배열 double 평균 : " + result2);
	}

	public static double avgAry(double[] ary) { // 매개값으로 받는 배열의 요소들의 평균 계산하기.
		double sum = 0;
		double avg = 0;
		for(int i =0; i<ary.length;i++) {
			sum += ary[i];
		}
		avg =  sum / ary.length;
			return avg;
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}