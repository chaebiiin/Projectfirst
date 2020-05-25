package com.yedam.collectionExample;

public class Board { //필드
	String title; //생성자
	String content;
	String writer;
	
	public Board (String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [글 제목 :" + title + ", 내 용 : " + content + ", 작성자 : " + writer + "]";
	}
	
}
