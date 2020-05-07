package com.yedam.dev;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] intAry = new int[3][];
		intAry[0] = new int[] { 95, 86 };
		intAry[1] = new int[] { 83, 92, 96 };
		intAry[2] = new int[] { 78, 83, 93, 87, 88 };

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				sum += intAry[i][j];
				avg = sum / intAry[i][j];
			}
                cnt += intAry[i].length;
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double)sum / cnt);
	}
}
