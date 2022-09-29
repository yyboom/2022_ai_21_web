package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	String dir = "cart/";
	
	@Autowired
	CartService service;
	
	//get
	@RequestMapping("/get")
	public String get(Model model) {
		List<CartDTO> cart = null;
		try {
			cart = service.get();
			model.addAttribute("cartlist", cart);
			model.addAttribute("center", dir+"get");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	//get->deletecart
	@RequestMapping("/deletecart")
	public String deletecart(Model model, int id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:get";
	}
	
	//resister
	@RequestMapping("/resister")
	public String resister(Model model) {
		//center는 cart folder밑에 get이 들어가게 된다!
		model.addAttribute("center", dir+"resister");
		return "index";
	}

}
