package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.dto.ItemDTO;
import com.multi.mapper.ItemMapper;
import com.multi.service.AdmService;

@Controller
public class MainController {
	
	@Autowired
	AdmService service;
	
	@Autowired
	ItemMapper mapper;
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	//login->loginimpl
	//login부분은 modal창으로 해결함!
	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session, String id, String pwd, Model model) {
		AdmDTO adm = null;
		try {
			adm=service.get(id);
			if(adm==null) {
				model.addAttribute("center", "index");
			}else {
				if(pwd.equals(adm.getPwd())) {
					session.setAttribute("loginadmin", adm);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/";
	}
	//loginimpl->logout
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//session을 거절하고 다시 main으로 보냄!
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	//login->searchimpl
	//login부분은 modal창으로 해결함!
	@RequestMapping("/searchimpl")
	//input은 name이 들어옴!!
	public String searchimpl(String txt, Model model) {
		List<ItemDTO> list =  null;
		
		try {
			list= mapper.searchitem(txt);
			model.addAttribute("itemlist", list);
			model.addAttribute("center", "search");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
}
