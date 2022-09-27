package com.multi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.service.CartService;
import com.multi.service.CustService;

//maincenter.html에서 html이 아닌 결과값을 보내주기 때문에 controller가 아닌 restcontroller을 넣어줘야함!
@RestController
public class AController {
	@Autowired
	CustService cust_service;
	
	@Autowired
	CartService cart_service;
	
	//maincenter.html에서 gettime으로 시간을 요청하면 여기서 시간을 보내줌(다시 maincenter로!)
	@RequestMapping("/gettime")
	public Object gettime(){
		Date d = new Date();
		return "Server Time:"+d.toString();
	}
	
	@RequestMapping("/checkid")
	public Object checkid(String cid){
		String result = "";
		//id가 데이터베이스에서 null값으로 나왔다면 register에서 새로 등록이 가능한 아이디로 됨!
		CustDTO cust = null;
		//데이터베이스에 연동!
		//cid를 가져와서 이둘이 같으면
		try {
			cust=cust_service.get(cid);
			if(cust==null) {
				//id가 데이터베이스에 현재 없으니 등록이 가능하다.
				result="t";
			}else {
				result="f";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//ajax로 addcart만 딱 해주는 것!
	@RequestMapping("/addcart")
	public Object addcart(CartDTO cart){
		try {
			cart_service.register(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
}
