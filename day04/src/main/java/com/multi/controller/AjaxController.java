package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /ajax가 들어왔을 때 AjaxController를 불러주게 되는 것!
@RequestMapping("/ajax")
public class AjaxController {
	
	
	@RequestMapping("") //javascript의 mainpage부분을 /ajax가 들어왔을 때 불러준다!
	public String ajax(Model model) {
		//ajax에 요청에 들어오면 center에는 ajax_center로, left는 ajax_left로 변경해라!
		//ajax와 관련된 모든 파일을 다 ajax폴더에 관리하기 때문에 ajax/ajax_~~로 호출해준다.
		model.addAttribute("center","ajax/ajax_center");
		model.addAttribute("left","ajax/ajax_left");
		return "main";
	}
	@RequestMapping("/ajax01")
	public String ajax01(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax01의 center로 바꿔줘야 함!
		//ajax폴더에 ajax01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax02")
	public String ajax02(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax02의 center로 바꿔줘야 함!
		//ajax폴더에 ajax02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax03")
	public String ajax03(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax03의 center로 바꿔줘야 함!
		//ajax폴더에 ajax03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax04")
	public String ajax04(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax04의 center로 바꿔줘야 함!
		//ajax폴더에 ajax04이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax04");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax05")
	public String ajax05(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax05의 center로 바꿔줘야 함!
		//ajax폴더에 ajax05이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax05");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax06")
	public String ajax06(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax06의 center로 바꿔줘야 함!
		//ajax폴더에 ajax06이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax06");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/ajax07")
	public String ajax07(Model model) {
		//main.html의 javascript의 ajax_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","ajax/ajax_left");
		//ajax07의 center로 바꿔줘야 함!
		//ajax폴더에 ajax07이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "ajax/ajax07");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}

}
