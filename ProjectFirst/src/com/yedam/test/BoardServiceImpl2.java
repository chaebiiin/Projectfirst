package com.yedam.test;

import java.util.List;

public class BoardServiceImpl2 implements BoardService {

	@Override
	public void createBoard(List<Board> list, Board board) {
		list.add(board);

	}

	@Override
	public void changeBoard(List<Board> list, Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) { // 같은 값이 있으면..
				list.get(i).setContent(board.getContent()); // setContent를 통해서 그 값을 넣음?
			}
		}
	}

	@Override
	public void removeBoard(List<Board> list, String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}

	}

	@Override
	public void showBoard(List<Board> list) {
		for (Board board : list) {
			System.out.println(board.toString());
		}
	}

}
