package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@Controller
@RequestMapping("/adm")
public class AdmController {
	
	String dir = "adm/";
	
	@Autowired
	AdmService service;
	
	//get
	@RequestMapping("/get")
	public String get(Model model) {
		List<AdmDTO> list = null;
		try {
			list = service.get();
			model.addAttribute("list", list);
			//center는 cart folder밑에 get이 들어가게 된다!
			model.addAttribute("center", dir+"get");
		} catch (Exception e) {
			// 에러가 생기면 에러페이지를 따로 만들어서 넣어주는 것임
			e.printStackTrace();
		}
		return "index";
	}
	
	//detail
	@RequestMapping("/detail")
	public String detail(Model model, String id) {
		AdmDTO adm = null;
		try {
			adm = service.get(id);
			model.addAttribute("a", adm);
			//center는 cart folder밑에 get이 들어가게 된다!
			model.addAttribute("center", dir+"detail");
		} catch (Exception e) {
			// 에러가 생기면 에러페이지를 따로 만들어서 넣어주는 것임
			e.printStackTrace();
		}
		return "index";
	}
	
	//update
	@RequestMapping("/update")
	public String update(Model model, AdmDTO adm) {
		try {
			service.modify(adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:detail?id="+adm.getId();
	}
	
	//delete
	@RequestMapping("/delete")
	public String delete(Model model, String id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:get";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", dir+"register");
		return "index";
	}
	
	
	  //registerimpl
	  
	  @RequestMapping("/registerimpl")
	  public String registerimpl(Model model, AdmDTO adm) {
		  try {
			service.register(adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return "redirect:get";
	  }
		 
	 

}
