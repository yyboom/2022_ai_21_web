package com.multi.controller;

import java.util.List;

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
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	//item
	@RequestMapping("/item")
	public String item(Model model) {
		List<ItemDTO> list = null;
		try {
			//item 다시 가져옴
			list = item_service.get();
			model.addAttribute("itemlist", list);
			model.addAttribute("center", "item");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//cart
	@RequestMapping("/cart")
	public String cart(Model model, String id) {
		List<CartDTO> cart = null;
		try {
			cart = cart_service.cartall(id);
			model.addAttribute("cartlist", cart);
			model.addAttribute("center", "cart");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "main";
	}
	//deletecart
	@RequestMapping("/deletecart")
	public String deletecart(Model model, int id, String user_id) {
		try {
			cart_service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cart?id="+user_id;
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
	
	//custdetail
	@RequestMapping("/custdetail")
	//get으로 가져올 때 cust의 id를 입력해야 가져올 수 있음!!
	public String custdetail(Model model, String id) {
		CustDTO cust =null;
		try {
			cust=cust_service.get(id);
			//cust정보를 custdetail과 같은 객체로 보내라
			model.addAttribute("custdetail", cust);
			//center page에 custdetail를 뿌려라
			model.addAttribute("center", "custdetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//itemdetail
	@RequestMapping("/itemdetail")
	//get으로 가져올 때 cust의 id를 입력해야 가져올 수 있음!!
	public String itemdetail(Model model, int id) {
		ItemDTO item =null;
		try {
			item=item_service.get(id);
			//cust정보를 custdetail과 같은 객체로 보내라
			model.addAttribute("itemdetail", item);
			//center page에 custdetail를 뿌려라
			model.addAttribute("center", "itemdetail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}
	
	//custupdate
	@RequestMapping("/custupdate")
	//get으로 가져올 때 cust의 id를 입력해야 가져올 수 있음!!
	//update화면
	public String custupdate(Model model, String id) {
		CustDTO cust =null;
		try {
			cust=cust_service.get(id);
			//cust정보를 custupdate과 같은 객체로 보내라
			model.addAttribute("custupdate", cust);
			//center page에 custupdate를 뿌려라
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
	
	//loginimpl
	@RequestMapping("/loginimpl")
	//model에다가 값을 담아서 login ok, login fail page로 보내줌
	public String loginimpl(String id, String pwd, Model model, HttpSession session) {
		CustDTO cust =null;
		try {
			cust=cust_service.get(id);
			//id가 없을 때
			if(cust==null) {
				model.addAttribute("center", "loginfail");
			}else {
				//id가 데이터베이스에 있을 때 그 아이디의 pwd 맞으면
				if(pwd.equals(cust.getPwd())) {
					session.setAttribute("logincust", cust);
					model.addAttribute("center", "loginok");
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
	@RequestMapping("/registerimpl")
	//model에다가 값을 담아서 register ok, register fail page로 보내줌
	public String registerimpl(Model model, CustDTO cust, HttpSession session) {
			
		try {
			cust_service.register(cust);
			//로그인하고 있는 정보를 http가 열려있는 상태나 특별한 이벤트가 없지 않는 이상 저장해둠
			//회원가입을 했을 때 자동으로 로그인이 된 것!
			//login했을때의 cust객체를 logincust에 넣음! logincust가 객체가 되는 것!
			session.setAttribute("logincust", cust);
			//정상일때는
			model.addAttribute("center", "registerok");
			//객체를 넣을 수도 있음!
			//객체로 보내면 객체 안에 있는 attribute모두를 쓸 수 있기 때문에 좋음
			model.addAttribute("rid", cust);
		} catch (Exception e) {
			//login fail
			model.addAttribute("center", "registerfail");
				//registerfail page에 특정 값을 내보낼 때 model사용함! 이것이 tymleaf가 하는 일!
			model.addAttribute("fid", cust.getId());
		}

		return "main";
	}


}
