package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {//스프링에서 작동되어지는 클래스(controller기능을 하는 클래스)
	
	@RequestMapping("/")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String main() {
		return "main";//main.html을 의미함(template에 있는)
	}
	
	@RequestMapping("/np1.nhn")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String np1() {
		return "nextp1";//nextp1.html을 실행하라 라는 의미가 됨!
	}
	
	@RequestMapping("/np2")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String np2() {
		return "nextp2";//nextp2.html을 실행하라 라는 의미가 됨!
	}
	
	@RequestMapping("/np3")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String np3() {
		return "nextp3";//nextp3.html을 실행하라 라는 의미가 됨!
	}
	
	@RequestMapping("/np4")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String np4() {
		return "nextp4";//nextp4.html을 실행하라 라는 의미가 됨!
	}
	
	@RequestMapping("/np5")//어떤 request가 들어왔을때 예기 정의 되니!!
	//http://127.0.0.1/(뒤에 /가 붙어서 날라가게 되는 것!)
	public String np5() {
		return "nextp5";//nextp5.html을 실행하라 라는 의미가 됨!
	}


}

