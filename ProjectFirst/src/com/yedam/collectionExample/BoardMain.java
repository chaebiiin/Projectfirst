package com.yedam.collectionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceLmpl();
		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("1.제목 입력  2.내용 수정  3.삭제  4.전체리스트   5.종료  ");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
			System.out.println("제목을 입력하세요.");
			String title = scn.nextLine();
			System.out.println("글 내용 입력하세요.");
			String content = scn.nextLine();
			System.out.println("작성자를 입력하세요.");
			String writer = scn.nextLine();
			Board board = new Board(title, content, writer);
			service.createBoard(list, board);

			for (Board brd : list) {
				System.out.println(brd);
			} 
			} else if (menu == 2) { //수정
			
				     	
			} else if (menu == 3) { //삭제
				System.out.println("삭제 할 글 제목을 입력하세요.");
				String Title = scn.nextLine();
				service.removeBoard(list, Title);
				
			} else if (menu == 4) { //리스트
//			 service.getBoardList(board);
			 
			} else if (menu == 5) { //종료
				break;
			}
			
//			scn.close();			
		} //wile
		System.out.println("프로그램 종료.");
	} // main
} // class