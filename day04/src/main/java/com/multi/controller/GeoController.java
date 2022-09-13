package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// /geo가 들어왔을 때 geoController를 불러주게 되는 것!
@RequestMapping("/geo")
public class GeoController {
	
	
	@RequestMapping("") //javascript의 mainpage부분을 /geo가 들어왔을 때 불러준다!
	public String geo(Model model) {
		//geo에 요청에 들어오면 center에는 geo_center로, left는 geo_left로 변경해라!
		//geo와 관련된 모든 파일을 다 geo폴더에 관리하기 때문에 geo/geo_~~로 호출해준다.
		model.addAttribute("center","geo/geo_center");
		model.addAttribute("left","geo/geo_left");
		return "main";
	}
	@RequestMapping("/geo01")
	public String geo01(Model model) {
		//main.html의 javascript의 geo_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","geo/geo_left");
		//geo01의 center로 바꿔줘야 함!
		//geo폴더에 geo01이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "geo/geo01");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/geo02")
	public String geo02(Model model) {
		//main.html의 javascript의 geo_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","geo/geo_left");
		//geo02의 center로 바꿔줘야 함!
		//geo폴더에 geo02이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "geo/geo02");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}
	@RequestMapping("/geo03")
	public String geo03(Model model) {
		//main.html의 javascript의 geo_left와 같은 모양으로 나와야 함!
		model.addAttribute("left","geo/geo_left");
		//geo03의 center로 바꿔줘야 함!
		//geo폴더에 geo03이라는 center모양을 불러오게 되는 것!
		model.addAttribute("center", "geo/geo03");
		//전체적인 화면은 main.html과 같아야 함. left랑 center만 바뀌게 해주는 것
		return "main";
	}

}
