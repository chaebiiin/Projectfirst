package com.yedam.test;

public class Board { //필드
	private	String title; //생성자
	private String content;
	private String writer;
	
	public Board (String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
//--------------------------------set!----------------------------------
	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
//--------------------------------get!----------------------------------
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	@Override
	public String toString() {
		return title + ", " + content + ", " + writer;
	
	}

	
	
}
