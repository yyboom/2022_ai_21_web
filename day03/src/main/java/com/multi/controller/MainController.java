package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/about") //main html에서 center이라는 곳에서 about을 집어넣음! ${about}이 되는 것
	public String about(Model model) {
		model.addAttribute("center","about");
		model.addAttribute("left","left_about");
		return "main";
	}
	@RequestMapping("/projects") //main html에서 center이라는 곳에서 about을 집어넣음! ${about}이 되는 것
	public String projects(Model model) {
		model.addAttribute("center","projects");
		model.addAttribute("left","left_projects");
		return "main";
	}
	@RequestMapping("/contact") //main html에서 center이라는 곳에서 about을 집어넣음! ${about}이 되는 것
	public String contact(Model model) {
		model.addAttribute("center","contact");
		model.addAttribute("left","left_contact");
		return "main";
	}

}
