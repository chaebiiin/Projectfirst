package com.yedam.collectionExample;

import java.util.List;

public class BoardServiceLmpl implements BoardService {
  				
	@Override
	public void createBoard(List<Board> list, Board board) {  //생성 
		list.add(board);
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());			
			}
		}
	}

	@Override
	public void changeBoard(List<Board> list) { //수정
		
	}

	@Override
	public void removeBoard(List<Board> list, String Title) { // 삭제
		list.remove(Title);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.remove(i).toString());
		}
	}

	@Override
	public void getBoardList(List<Board> list, Board board) { //리스트 조회
		for(int i = 0; i<list.size(); i++  ) {
			if (board != null)
				System.out.println(board.toString());
		}
	}
}