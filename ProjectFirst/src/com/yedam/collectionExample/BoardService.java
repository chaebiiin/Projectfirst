package com.yedam.collectionExample;

import java.util.List;

public interface BoardService {
	void createBoard(List<Board> list, Board board); // 생성
	void changeBoard(List<Board> list);// 수정
	void removeBoard(List<Board> list, String title);// 삭제
	void getBoardList(List<Board> list , Board board);// 리스트

}
