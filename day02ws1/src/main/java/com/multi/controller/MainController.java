package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.vo.Cust;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(String fid, String fpwd) {
		String distinct = null;
		//특정 아이디랑 비밀번호가 같으면 로그인 성공 => mainpage로 돌아감
		//여기는 나중에 데이터베이스를 연결해서 
		//1. 아이디가 이미 있는데 비밀번호가 다른 경우
		//2.없는 아이디인 경우
		//3.아이디 비밀번호가 다 맞는 경우
		//로 바꿔서 로그인을 처리해줄 수 있음
		if (fid.equals("qqq")&&fpwd.equals("111"))
			distinct = "main";
		else {//다른 아이디나 비밀번호를 적었다면 로그인 실패 와면으로 감
			distinct = "loginfail";
		}

		return distinct;
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@RequestMapping("/registerimpl")//register에 많은 것을 입력한 후 버튼을 누르면 이리로 옴.
	//이때 개인정보임으로 이를 private하게 관리해주어야 하므로 cust class로 따로 불러줘서 set으로 나올 수 있도록 해줌
	//java console곳에는 register에 등록한 사람의 정보가 나옴!
	public String registerimpl(Cust cust) {//여러건을 받아야 할 때는 따로 class를 만들어서 처리
		System.out.println(cust);
		return "main";
	}
	@RequestMapping("/table")
	public String table() {
		return "table";
	}

}
