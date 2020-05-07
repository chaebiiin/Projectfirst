package com.yedam.dev;

public class ArrayExample2 {
	public static void main(String[] args) {
		// System.out.println(getLargeValue(10,20, 15));
		// System.out.println(getLargeValue(new int[] {52,6,2,9,10}));
		// String result = getString("Hello", "World");
		// System.out.println(result);
		// String[] ary = { "Lee", "Kim", "Park", "Choi", "Han" };
		// System.out.println(getString(ary));

		int[][] intAry3 = new int[3][3];// 행,열(칼럼)
		intAry3[0] = new int[] { 1, 2, 3 }; // 2차원 배열, 배열안에 또 다른 배열을 넣음.
		intAry3[1] = new int[] { 4, 5, 6 };
		intAry3[2] = new int[] { 7, 8, 9 };

		intAry3[0][0] = 1;
		intAry3[0][1] = 2;
		intAry3[0][2] = 3; // 위의 문장과 같음

		for (int i = 0; i < intAry3.length; i++) {
			for (int j = 0; j < intAry3.length; j++) {
				System.out.print(intAry3[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}

	public static String getString(String[] strAry) {
		String result = "";
		for (int i = 0; i < strAry.length; i++) {

			result += strAry[i] + "-";
		}

		return result;
	}

	public static String getString(String str1, String str2) {
		String result = str1 + " -" + str2;
		return result;
	}

	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < ary.length; i++) {

			if (ary[i] >= maxValue)
				maxValue = ary[i];
		}
		return maxValue; // p182 확인문제7번
	}

	public static int getLargeValue(int a, int b, int c) { // (getLargeValue)는 a와b중에 큰걸 반환하는 것
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;

	} // end of main
} // end of class
