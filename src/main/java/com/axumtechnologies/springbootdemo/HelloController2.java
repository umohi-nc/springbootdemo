package com.axumtechnologies.springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello world Spring boot!";
	}

	@RequestMapping("/page1")
	public String page1() {
		return "Hello world Page1!";
	}
}
