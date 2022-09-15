package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /js가 들어왔을 때 JsController를 불러주게 되는 것!
@RequestMapping("/cust")
public class CustController {
	
	//javascript의 mainpage부분을 /js가 들어왔을 때 불러준다!
	@RequestMapping("") 
	public String cust(Model model) {
		//js에 center이나 left로 요청이 들어오면 center에는 js_center로, left는 js_left로 변경해라!
		//js와 관련된 모든 파일을 다 js폴더에 관리하기 때문에 js/js_~~로 호출해준다.
		model.addAttribute("center","cust/cust_center");
		model.addAttribute("left","cust/cust_left");
		return "main";
	}
	
	@RequestMapping("/cust01")
	public String cust01(Model model) {
		//main.html의 javascript의 js/js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","cust/cust_left");
		//je01의 center로 바꿔줘야함!
		//js폴더에 js01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","cust/cust01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/cust02")
	public String js02(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","cust/cust_left");
		//je02의 center로 바꿔줘야함!
		//js폴더에 js02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","cust/cust02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/cust03")
	public String js03(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","cust/cust_left");
		//je03의 center로 바꿔줘야함!
		//js폴더에 js03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","cust/cust03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
}