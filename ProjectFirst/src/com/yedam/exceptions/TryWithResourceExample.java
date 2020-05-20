package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		
		String paths = "src/com/yedam/exceptions/AccountExample.java"; //<-불러올 파일의 경로를 다 적어줘야 함.
		try(FileInputStream fis = new FileInputStream(paths);) {
//			fis = new FileInputStream(paths); // 파일을 읽거나 쓸 때는 무조건 예외처리를 해줘야함
			int readByte;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
//		try {
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} <-위 처럼쓰면 close하는 부분이 사라짐;; / 파일을 읽거나 쓸때는 무조건 close부분이 들어가야함.
	} //main
}
