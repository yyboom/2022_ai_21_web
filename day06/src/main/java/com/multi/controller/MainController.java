package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.dto.ItemDTO;
import com.multi.service.CartService;
import com.multi.service.CustService;
import com.multi.service.ItemService;

@Controller
public class MainController {
	@Autowired
	CustService cust_service;
	
	@Autowired
	ItemService item_service;
	
	@Autowired
	CartService cart_service;
	
	//모든 부분을 따로 controller를 만들어서 관리함!
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	//itemdetail
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model, int id) {
		//select해올 item을 넣어야함!
		ItemDTO item = null;
		try {
			//id값을 가지고 있는 id정보들을 불러옴
			item=item_service.get(id);
			//밑의 두개 itemdetail은 다른 것임!!!같은 애들 아님!!
			//item들을 itemdetail에 넣어줌
			model.addAttribute("itemdetail", item);
			//page는 item detail page가 center로 오게!
			model.addAttribute("center", "itemdetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//item
	@RequestMapping("/item")
	public String item(Model model) {
		//select해올 item을 넣어야함!
		List<ItemDTO> list =null;
		try {
			//item들을 list안에 넣어줌!
			list=item_service.get();
			//item들을 itemlist에 담음!
			model.addAttribute("itemlist", list);
			//page는 item page가 center로 오게!
			model.addAttribute("center", "item");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//shop
	@RequestMapping("/shop")
	public String shop(Model model) {
			//item들을 itemlist에 담음!
			model.addAttribute("left", "shopleft");
			//page는 item page가 center로 오게!
			model.addAttribute("center", "shopcenter");
		return "main";
	}
		
	//cart
	@RequestMapping("/cart")
	public String cart(Model model, String id) {
		//select해올 cart을 넣어야함!
		List<CartDTO> list =null;
		try {
			//item들을 list안에 넣어줌!
			list=cart_service.cartall(id);
			//item들을 itemlist에 담음!
			model.addAttribute("cartlist", list);
			//page는 item page가 center로 오게!
			model.addAttribute("center", "cart");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//deletecart
	@RequestMapping("/deletecart")
	//session을 이용해서 지워줄 수도 있음
	public String cart(Model model, int id, String user_id) {
		try {
			cart_service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  "redirect:cart?id="+user_id;
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
		
	//custdetail
	@RequestMapping("/custdetail")
	//id를 입력으로 받아와랴 해당하는 회원의 detail정보를 불러올 수 있음
	public String custdetail(Model model, String id) {
		CustDTO cust = null;
		try {
			cust=cust_service.get(id);
			model.addAttribute("custdetail", cust);
			//centerpage는 이친구임(cust)의 정보를 가지고 있는!!
			model.addAttribute("center", "custdetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	//custupdate
	@RequestMapping("/custupdate")
	//id를 입력으로 받아와랴 해당하는 회원의 detail정보를 불러올 수 있음
	public String custupdate(Model model, String id) {
		CustDTO cust = null;
		try {
			cust=cust_service.get(id);
			//select해온 값을 담아서
			model.addAttribute("custupdate", cust);
			//centerpage는 이친구임(cust)의 정보를 가지고 있는!!
			//수정하는 화면으로 이동한다.
			model.addAttribute("center", "custupdate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	//custupdateimpl
	@RequestMapping("/custupdateimpl")
	//id를 입력으로 받아와랴 해당하는 회원의 detail정보를 불러올 수 있음
	public String custupdateimpl(Model model, CustDTO updatecust) {
		//수정 한 이우에 custdetail 페이지로 이동
	    try {
			cust_service.modify(updatecust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//controller안에서 다른 controller호출할 때
		return "redirect:custdetail?id="+updatecust.getId();
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
		CustDTO cust = null;
		try {
			cust = cust_service.get(id);
			if(cust==null) {
				//id가 틀릴 때
				model.addAttribute("center", "loginfail");
			}else {
				//pwd가 맞을 때
				if(pwd.equals(cust.getPwd())) {
				session.setAttribute("logincust", cust);
				model.addAttribute("center", "loginok");
				//id,pwd가 다 아닐 때
				}else {
					model.addAttribute("center", "loginfail");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	//registerimpl
	//register을 했을 때 나타나는 것!
		@RequestMapping("/registerimpl")
		public String registerimpl(Model model, CustDTO cust, HttpSession session) {
			//custservice를 이용해서 database로 보내주기 위한 부분!
			try {
				//회원가입이 정상일 때!!
				cust_service.register(cust);
				//회원가입을 했을 때 자동으로 로그인이 된 것!
				session.setAttribute("logincust", cust);
				//정상일때는
				model.addAttribute("center", "registerok");
				//객체를 넣을 수도 있음!
				model.addAttribute("rid", cust);
			} catch (Exception e) {
				//중복된 id를 넣을 때는 !!registerfail로 가게 한다.
				model.addAttribute("center", "registerfail");
				//registerfail page에 특정 값을 내보낼 때 model사용함! 이것이 tymleaf가 하는 일!
				model.addAttribute("fid", cust.getId());
			}
			
			return "main";
		}

}
