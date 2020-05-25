package com.yedam.collectionExample;

import java.util.List;

public class BoardServiceLmpl implements BoardService {

	@Override
	public void createBoard(List<Board> list, Board board) { //생성? 입력
		list.add(board);
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());			
			}
		}
	}

	@Override
	public void changeBoard(List<Board> list, Board board) { //수정
		
	}

	@Override
	public void removeBoard(List<Board> list, Board board) { //삭제
		list.remove(board);
		for(int i = 0; i<list.size(); i++) {
				System.out.println(list.get(i).toString());        
		}
	}

	@Override
	public void getBoardList(List<Board> list, Board board) { //조회
//		list.get(board);
		for(int i = 0; i<list.size(); i++  ) {
			if (board != null)
				System.out.println(board.toString());
		}
	}
	
} //class