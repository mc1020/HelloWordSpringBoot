package com.infotech.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String hello(){
		return "Hello World!!";
	}
	
	@RequestMapping(value="/ss")
	public String ss(){
		return "test Hello World!!";
	}
	
	@RequestMapping(value="/bn")
	public String bn(){
		return "bn Hello World!!";
	}
	
	@RequestMapping(value="/mm")
	public String mm(){
		return "kskskbn Hello World!!";
	}
}
