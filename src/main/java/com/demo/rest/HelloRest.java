package com.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloRest {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome";
	}
}
