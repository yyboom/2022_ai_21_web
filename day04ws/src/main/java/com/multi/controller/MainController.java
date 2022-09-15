package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.vo.CustVo;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	//login
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "main";
	}
	//register
		@RequestMapping("/register")
		public String register(Model model) {
			model.addAttribute("center", "register");
			return "main";
	}
	//logout
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "main";
	}
	
	//loginimpl
	@RequestMapping("/loginimpl")
	//model에다가 값을 담아서 login ok, login fail page로 보내줌
	public String loginimpl(String id, String pwd, Model model, HttpSession session) {
		//id가 qqqq, pwd가 1111이면 loginok로, 아니면 loginfail로 보내줌
		if(id.equals("qqqq") && pwd.equals("1111")){
			//session안에 로그인을 했다는 겅보를 저장해둠
			//model과는 다르게 session에 넣어둔 것은 로그아웃할때까지 계속 저장됨
			session.setAttribute("loginid", id);
			//center에 loginok를 넣어서 보낼 것이다!
			model.addAttribute("center","loginok");
			//loginid라는 곳에 id를 넣어서 보낼 것이다!
			model.addAttribute("loginid",id);
		}else {
			model.addAttribute("center","loginfail");
		}
		return "main";
	}
	//registerimpl
		@RequestMapping("/registerimpl")
		//model에다가 값을 담아서 register ok, register fail page로 보내줌
		public String registerimpl(Model model, CustVo cust) {

			model.addAttribute("center", "registerok");
			model.addAttribute("rid", cust.getId());
			return "main";
		}

}
