package com.yedam.morning;

public class Code20200617 {
	public static void main(String[] args) {
//		int[] arr = new int[10];
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		
	
//		for (int i=0; i<arr.length;) {
//			int random = (int) (Math.random()*10) +1;
//			
//			boolean check = false;
//			for(int j = 0; j<i; j++) {
//				if (arr[j] == random) {
//					check = true;
//					break;
//				}
//			} 
//			if(!check) {
//				arr[i] =random;
//				System.out.println(arr[i] + " ");
//				i++;
//			}
//		} 
//
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println("");
//	}
	}

}
