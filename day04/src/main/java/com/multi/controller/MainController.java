package com.multi.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	//모든 부분을 따로 controller를 만들어서 관리함!
	
	
	//main.html에서 /js로 요청이 들어오면 리턴은 main.html이 기본임.
	//여기 안에서 left와 center부분만 다르게 바꾸어 주는 것!
//	@RequestMapping("/js") //main html에서 center이라는 곳에서 js_center을 집어넣음! ${js_center}이 되는 것
//	//main html에서 left이라는 곳에서 js_left을 집어넣음! ${js_left}이 되는 것
//	public String js(Model model) {
//		//js에 center이나 left로 요청이 들어오면 center에는 js_center로, left는 js_left로 변경해라!
//		model.addAttribute("center","js_center");
//		model.addAttribute("left","js_left");
//		return "main";
//	}
	
	
	
	/*
	 * //main.html에서 /ajax로 요청이 들어오면 리턴은 main.html이 기본임. //여기 안에서 left와 center부분만
	 * 다르게 바꾸어 주는 것!
	 * 
	 * @RequestMapping("/ajax") //main html에서 center이라는 곳에서 ajax_center을 집어넣음!
	 * ${ajax_center}이 되는 것 //main html에서 left이라는 곳에서 ajax_left을 집어넣음! ${ajax_left}이
	 * 되는 것 public String ajax(Model model) { //ajax에 요청에 들어오면 center에는
	 * ajax_center로, left는 ajax_left로 변경해라!
	 * model.addAttribute("center","ajax_center");
	 * model.addAttribute("left","ajax_left"); return "main"; }
	 */
	
	/*
	 * //main.html에서 /chart로 요청이 들어오면 리턴은 main.html이 기본임. //여기 안에서 left와 center부분만
	 * 다르게 바꾸어 주는 것!
	 * 
	 * @RequestMapping("/chart") //main html에서 center이라는 곳에서 chart_center을 집어넣음!
	 * ${chart_center}이 되는 것 //main html에서 left이라는 곳에서 chart_left을 집어넣음!
	 * ${chart_left}이 되는 것 public String chart(Model model) { //chart에 요청에 들어오면
	 * center에는 chart_center로, left는 chart_left로 변경해라!
	 * model.addAttribute("center","chart_center");
	 * model.addAttribute("left","chart_left"); return "main"; }
	 */
	
	/*
	 * //main.html에서 /geo로 요청이 들어오면 리턴은 main.html이 기본임. //여기 안에서 left와 center부분만 다르게
	 * 바꾸어 주는 것!
	 * 
	 * @RequestMapping("/geo") //main html에서 center이라는 곳에서 geo_center을 집어넣음!
	 * ${geo_center}이 되는 것 //main html에서 left이라는 곳에서 geo_left을 집어넣음! ${geo_left}이 되는
	 * 것 public String about(Model model) { //geo에 요청에 들어오면 center에는 geo_center로,
	 * left는 geo_left로 변경해라! model.addAttribute("center","geo_center");
	 * model.addAttribute("left","geo_left"); return "main"; }
	 */

}
