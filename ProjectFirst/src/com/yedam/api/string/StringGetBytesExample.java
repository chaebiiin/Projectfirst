package com.yedam.api.string;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		String str1 = "HELLO";
		byte[] bytes1 = str.getBytes();
		byte[] bytes2 = str1.getBytes();
		System.out.println("bytes.length : " + bytes1.length);
		System.out.println("bytes.length : " + bytes1.length);

	}
}
