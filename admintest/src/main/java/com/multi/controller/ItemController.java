package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	String dir = "item/";
	
	@RequestMapping("/get")
	public String get(Model model) {
		//center는 cart folder밑에 get이 들어가게 된다!
		model.addAttribute("center", dir+"get");
		return "index";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		//center는 cart folder밑에 get이 들어가게 된다!
		model.addAttribute("center", dir+"register");
		return "index";
	}

}
