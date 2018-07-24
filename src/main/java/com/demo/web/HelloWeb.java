package com.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class HelloWeb {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "userPage";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "adminPage";
	}
	
	@RequestMapping("/HelloWorld")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
}
