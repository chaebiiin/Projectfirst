package com.yedam.collectionExample;

import java.util.List;

public class BoardServiceLmpl implements BoardService {

	@Override
	public void createBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void changeBoard(List<Board> list, Board board) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());			
			}
		}
	}

	@Override
	public void removeBoard(List<Board> list, Board board) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.remove(board.getTitle());
			}         
		}
	}

	@Override
	public void getBoardList(List<Board> list, Board board) {
		for(int i = 0; i<list.size(); i++  ) {
			if (board != null)
				System.out.println(board.toString());
		}
	}
}