package com.yedam.morning;

public interface Code20200515 {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int cnt = 1;

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				ary[i][j] = cnt++;

			}
		}

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.print(ary[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("===================================");

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.print(ary[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("===================================");
		for (int i = 1; i <= ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.print(i +j*5+ "\t");
			}
			System.out.println();
		}
	}
}
