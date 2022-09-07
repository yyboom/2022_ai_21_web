package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return"main";
	}
	
	@RequestMapping("/p1")
	public String p1() {
		return"p1";
	}
	
	@RequestMapping("/p2")
	public String p2() {
		return"p2";
	}
	
	@RequestMapping("/p3")
	public String p3() {
		return"p3";
	}
	
	@RequestMapping("/p4")
	public String p4() {
		return"p4";
	}

}

