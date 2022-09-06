package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.vo.Cust;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(String fid, String fpwd) {
		System.out.println("Login Impl");//자바의 콘솔로도 출력함!
		System.out.println(fid+" "+fpwd);
		String next = null;
		if(fid.equals("qqq")&&fpwd.equals("111"))
			next = "main";
		else {
			next = "loginfail";
		}
			return next;
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Cust cust) {//여러건을 받아야 할 때는 따로 class를 만들어서 처리
		System.out.println(cust);
		return "main";
	}
	
	@RequestMapping("/css")
	public String css(String page) {
		return page;
	}

}
