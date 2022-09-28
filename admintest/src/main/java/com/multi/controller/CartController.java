package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	String dir = "cart/";
	
	@RequestMapping("")
	public String main(Model model) {
		//center는 cart folder밑에 get이 들어가게 된다!
		model.addAttribute("center", dir+"get");
		return "index";
	}

}
