package com.yedam.classes;

public class Gugudan {
	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				if (i == 0)
					System.out.print("[" + j + "단]" + "\t");
				else
					System.out.print(j + " X " + i + "=" + (i * j) + " ");
			}
			System.out.println();
		}
	}
}