package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /jq가 들어왔을 때 jQueryController를 불러주게 되는 것!
@RequestMapping("/jq")
public class jQueryController {
	
	
	@RequestMapping("") //javascript의 mainpage부분을 /jq가 들어왔을 때 불러준다!
	public String jq(Model model) {
		//jq에 요청에 들어오면 center에는 jq_center로, left는 jq_left로 변경해라!
		//jq와 관련된 모든 파일을 다 jq폴더에 관리하기 때문에 jq/jq_~~로 호출해준다.
		model.addAttribute("center","jq/jq_center");
		model.addAttribute("left","jq/jq_left");
		return "main";
	}
	@RequestMapping("/jq01")
	public String jq01(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq01의 center로 바꿔줘야 함!
		//jq폴더에 jq01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq02")
	public String jq02(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq02의 center로 바꿔줘야 함!
		//jq폴더에 jq02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq03")
	public String jq03(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq03의 center로 바꿔줘야 함!
		//jq폴더에 jq03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq04")
	public String jq04(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq04의 center로 바꿔줘야 함!
		//jq폴더에 jq04이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq04");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq05")
	public String jq05(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq05의 center로 바꿔줘야 함!
		//jq폴더에 jq05이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq05");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq06")
	public String jq06(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq06의 center로 바꿔줘야 함!
		//jq폴더에 jq06이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq06");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/jq07")
	public String jq07(Model model) {
		//main.html의 javascript의 jq_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","jq/jq_left");
		//jq07의 center로 바꿔줘야 함!
		//jq폴더에 jq07이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "jq/jq07");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}

}
