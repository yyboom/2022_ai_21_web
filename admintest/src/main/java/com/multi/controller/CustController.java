package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	String dir = "cust/";
	
	@Autowired
	CustService service;
	
	//get
	@RequestMapping("/get")
	public String get(Model model) {
		List<CustDTO> list = null;
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
		CustDTO cust = null;
		try {
			cust = service.get(id);
			model.addAttribute("c", cust);
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
	public String update(Model model, CustDTO cust) {
		try {
			service.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:detail?id="+cust.getId();
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
	public String registerimpl(Model model, CustDTO cust) {
		try {
			service.register(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//반드시 redirect로 써줘야함! 
		//redirect는 controller를 실행하라는 의미이기 때문에 내가 등록을 하면 get controller를 실행해서 새로 등록하려는 아이디를 등록한 후
		//다시 get controller를 실행시켜서 html을 새로 만든 후 배로한다는 의미임!
		return "redirect:get";
	}

}
