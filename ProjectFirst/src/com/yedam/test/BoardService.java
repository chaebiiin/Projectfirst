package com.yedam.test;

import java.util.List;

public interface BoardService {
	void createBoard(List<Board> list, Board board); // 생성
	void changeBoard(List<Board> list, Board board);// 수정
	void removeBoard(List<Board> list, String title);// 삭제
	void showBoard(List<Board> list);// 리스트
	

}
