package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@Controller
public class MainController {
	
	@Autowired
	AdmService service;
	
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
				model.addAttribute("center", "loginfail");
			}else {
				if(pwd.equals(adm.getPwd())) {
					session.setAttribute("loginadmin", adm);
					model.addAttribute("center", "loginok");
				}else {
					model.addAttribute("center", "loginfail");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	//loginimpl->logout
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//session을 거절하고 다시 main으로 보냄!
		if(session != null) {
			session.invalidate();
		}
		return "index";
	}
}
