/*
 * Copyright (C), 2011-2019.
 */
package com.wung.springbootstarter.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wung 2019-11-28.
 */
@Configuration
// 将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
@EnableConfigurationProperties(HellowordProperties.class)
// 当 HelloworldService 在类路径的下
@ConditionalOnClass({HelloWordService.class})
public class HellowordAutoConfiguration {
	
	@Autowired
	private HellowordProperties hellowordProperties;
	
	@Bean
	@ConditionalOnMissingBean(HelloWordService.class)
	public HelloWordService helloWordService() {
		HelloWordService helloWordService = new HelloWordService();
		helloWordService.setWord(hellowordProperties.getWord());
		return helloWordService;
	}
	
}
