package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /js가 들어왔을 때 JsController를 불러주게 되는 것!
@RequestMapping("/js")
public class JsController {
	
	//javascript의 mainpage부분을 /js가 들어왔을 때 불러준다!
	@RequestMapping("") 
	public String js(Model model) {
		//js에 center이나 left로 요청이 들어오면 center에는 js_center로, left는 js_left로 변경해라!
		//js와 관련된 모든 파일을 다 js폴더에 관리하기 때문에 js/js_~~로 호출해준다.
		model.addAttribute("center","js/js_center");
		model.addAttribute("left","js/js_left");
		return "main";
	}
	
	@RequestMapping("/js01")
	public String js01(Model model) {
		//main.html의 javascript의 js/js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je01의 center로 바꿔줘야함!
		//js폴더에 js01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js02")
	public String js02(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je02의 center로 바꿔줘야함!
		//js폴더에 js02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js03")
	public String js03(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je03의 center로 바꿔줘야함!
		//js폴더에 js03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js04")
	public String js04(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je04의 center로 바꿔줘야함!
		//js폴더에 js04이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js04");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js05")
	public String js05(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je05의 center로 바꿔줘야함!
		//js폴더에 js05이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js05");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js06")
	public String js06(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je06의 center로 바꿔줘야함!
		//js폴더에 js06이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js06");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	
	@RequestMapping("/js07")
	public String js07(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je07의 center로 바꿔줘야함!
		//js폴더에 js07이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js07");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js08")
	public String js08(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je08의 center로 바꿔줘야함!
		//js폴더에 js08이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js08");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js09")
	public String js09(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je09의 center로 바꿔줘야함!
		//js폴더에 js09이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js09");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js10")
	public String js10(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je10의 center로 바꿔줘야함!
		//js폴더에 js10이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js10");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js11")
	public String js11(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//js11의 center로 바꿔줘야함!
		//js폴더에 js11이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js11");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js12")
	public String js12(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//js12의 center로 바꿔줘야함!
		//js폴더에 js12이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js12");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/js13")
	public String js13(Model model) {
		//main.html의 javascript의 js_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","js/js_left");
		//je13의 center로 바꿔줘야함!
		//js폴더에 js13이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center","js/js13");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}

}
