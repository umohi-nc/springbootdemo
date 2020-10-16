package com.axumtechnologies.springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController2 {
	
	@RequestMapping("/two")
	public String index() {
		return "Hello world Spring boot!";
	}

	@RequestMapping("/two/page1")
	public String page1() {
		return "Hello world Page1!";
	}
}
