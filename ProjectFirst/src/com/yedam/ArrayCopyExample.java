package com.yedam;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		//방법1
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length); //< 복제된 배열?/ 위의 배열과 같은 길이와 동일한 배열이 만들어지고, 거기에 arr2가 리턴된다?
		System.out.println(Arrays.toString(arr2)); //arrays.toString은 문자열을 출력해줌.
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1,  1,3); // 원본배열, 시작 인덱스(A), 끝 인덱스이전까지(V)
		System.out.println(Arrays.toString(arr3));
		//방법3
		char[] arr4 = new char[arr1.length]; //copy 원본배열하고 똑같은 배열을 가지고 있는 배열을 만듬 (타켓배열)
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); //원본배열의 시작인덱스, 타겟배열의 시작인덱스(복사위치),몇개를 복사할지 갯수
		for(int i=0; i<arr4.length; i++)
			System.out.println("arr4[" + i + "] = " + arr4[i]);
	}
}
