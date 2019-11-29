/*
 * Copyright (C), 2011-2019.
 */
package com.wung.springbootstarter.helloword;

/**
 * @author wung 2019-11-28.
 */
public class HellowordService {
	
	private String word;
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	
	public String sayHello() {
		return "Hello, " + word;
	}
	
}
