package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /chart가 들어왔을 때 ChartController를 불러주게 되는 것!
@RequestMapping("/chart")
public class ChartController {
	
	
	@RequestMapping("") //javascript의 mainpage부분을 /chart가 들어왔을 때 불러준다!
	public String chart(Model model) {
		//chart에 요청에 들어오면 center에는 chart_center로, left는 chart_left로 변경해라!
		//chart와 관련된 모든 파일을 다 chart폴더에 관리하기 때문에 chart/chart_~~로 호출해준다.
		model.addAttribute("center","chart/chart_center");
		model.addAttribute("left","chart/chart_left");
		return "main";
	}
	@RequestMapping("/chart01")
	public String chart01(Model model) {
		//main.html의 javascript의 chart_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","chart/chart_left");
		//chart01의 center로 바꿔줘야 함!
		//chart폴더에 chart01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "chart/chart01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/chart02")
	public String chart02(Model model) {
		//main.html의 javascript의 chart_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","chart/chart_left");
		//chart02의 center로 바꿔줘야 함!
		//chart폴더에 chart02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "chart/chart02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/chart03")
	public String chart03(Model model) {
		//main.html의 javascript의 chart_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","chart/chart_left");
		//chart03의 center로 바꿔줘야 함!
		//chart폴더에 chart03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "chart/chart03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}

}
