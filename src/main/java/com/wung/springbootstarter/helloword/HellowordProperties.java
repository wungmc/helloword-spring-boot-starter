/*
 * Copyright (C), 2011-2019.
 */
package com.wung.springbootstarter.helloword;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wung 2019-11-28.
 */
@ConfigurationProperties(prefix = "helloword")
public class HellowordProperties {
	
	private String word;
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
}
