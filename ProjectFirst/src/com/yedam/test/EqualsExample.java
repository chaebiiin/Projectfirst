package com.yedam.test;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}}; //2차원 배열 (배열안의 배열) ,original는 변수의 이름.
		
		//얕은 복사비교 (번지만 비교해본다)
		System.out.println("[ 얕은 복제 후 비교 ]");
		int[][] cloned1 = Arrays.copyOf(original,  original.length); //배열을 만들고 copyOf 쓰면 얕은 복사가 됨. (원본, 원본의 길이만큼)복제
		
		System.out.println("배열 번지 비교 : " + original.equals(cloned1)); // 원본이 가지고 있는 배열과 복제된 배열의 번지 비교.
		System.out.println("1차 배열 항복값 비교 : " +  Arrays.equals(original, cloned1));// {1,2}비교? 배열안에 들어 있는 항목값의 번지 비교??? 
		
		System.out.println("중첩 배열 항복값 비교 : " +  Arrays.deepEquals(original, cloned1));// {3,4} 비교? 중첩값도 비교함. 
		
		//깊은 복사 후 비교
		System.out.println("\n[깊은 복제 후 비교 ]");
		int[][] cloned2 = Arrays.copyOf(original, original.length); //원본을 가지고 원본의 길이만큼 복제
		cloned2[0] = Arrays.copyOf(original[0], original[0].length); //원본의 0 인덱스가 참조 하고 있는 0의 길이만큼 복제??????
		cloned2[1] = Arrays.copyOf(original[1], original[1].length); // 원본의 1 인덱스가 참조하고 있는 1의 길이만큼 복제?????
		
		System.out.println("배열 번지 비교 : " + original.equals(cloned2)); // 원본이 가지고 있는 배열과 복제된 배열의 번지 비교.
		System.out.println("1차 배열 항복값 비교 : " +  Arrays.equals(original, cloned2));// {1,2}비교? 배열안에 들어 있는 항목값의 번지 비교??? 
		
		//deep
		System.out.println("중첩 배열 항복값 비교 : " +  Arrays.deepEquals(original, cloned2));// {3,4} 비교? 중첩값도 비교함. 
	}
}
