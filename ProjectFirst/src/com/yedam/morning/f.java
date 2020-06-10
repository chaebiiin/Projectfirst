package com.yedam.morning;

public class f {
	public void changeSelect() {
		int[] intAry = new int[5];
		int temp = 0;
		
		for (int i =0; i<5; i++) {
			intAry[i] = (int) (Math.random() * 5);
		for (int j=i+1; j<intAry.length; j++ ) {
			temp = intAry[i];
			intAry[i] = intAry[j];
			intAry[j]=temp;
		}
	
		} System.out.println();
		for(int i =0; i <intAry.length; i++) {
			System.out.println(intAry[i]);
}
	}

}
