package com.yedam;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98}; //배열을 가져옴.
		Arrays.sort(scores); // scores를 정렬 함 . {97(0), 98(1), 99(2)}
		int index = Arrays.binarySearch(scores, 99); //찾고자 하는 값의 인덱스를 얻음.
		System.out.println("찾은 인덱스 : " + index); //배열에서 99의 인덱스 값을 출력해줌. 
		
		
		//문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names); //{김민수(0), 박동수(1), 홍길동(2)
		index = Arrays.binarySearch(names, "홍길동"); 
		System.out.println("찾은 인덱스 : " + index);
	
		//객체검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member ("박동수");
		Member m3 = new Member("김문수");
		Member[] members = {m1, m2, m3}; // //{김민수(0), 박동수(1), 홍길동(2)
		Arrays.parallelSort(members);
		index = Arrays.binarySearch(members,  m1); //(members ,객체의 번지수를 넣어줌)
		System.out.println("찾은 인덱스 : " + index); // m1 값의 정렬된 위치를 알려줌.
	}
}
