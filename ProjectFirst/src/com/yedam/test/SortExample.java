package com.yedam.test;

import java.util.Arrays;


public class SortExample {
	public static void main(String[] args) {
		int [] scores = {99, 97, 98}; // scores 배열을 만듬.
		Arrays.sort(scores);//메소드를 지정해서 scores를 넣어줌.
		System.out.println(Arrays.toString(scores));
		for (int i=0; i <scores.length; i++) {
			System.out.println("scores [ " + i + "]" + scores[i]);
			
		}
		System.out.println();
		String[] names= {"김", "", "박"};
		Arrays.sort(names);
		for(int i =0; i<names.length; i++) {
			System.out.println(Arrays.toString(names));
			System.out.println("names [ " + i + "]" + names[i]);

		}
		System.out.println();
		
		 Member m1 = new  Member("김");
		 Member m2 = new Member ("최");
		Member m3 = new  Member("박");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int i =0; i<names.length; i++) {
		System.out.println(Arrays.toString(members));
		System.out.println("members [ " + i + "]" + members[i]);
		}
	}
}
