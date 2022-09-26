package com.multi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

//maincenter.html에서 html이 아닌 결과값을 보내주기 때문에 controller가 아닌 restcontroller을 넣어줘야함!
@RestController
public class AController {
	
	//custservice에서 get부분을 가져와서 아이디값이 있는지 체크를 함!!
	@Autowired
	CustService cust_service;
	
	//maincenter.html에서 gettime으로 시간을 요청하면 여기서 시간을 보내줌(다시 maincenter로!)
	@RequestMapping("/gettime")
	public Object gettime(){
		Date d = new Date();
		return "Server Time:"+d.toString();
	}
		
	//but 대부분은 이런방식으로 아이디존재 여부를 확인하지 않음
	//계속 서버에 요청해야 하기 때문임
	//따라서 아이디를 확인할 수 있는 버튼을 따로 만들어서! 아이디 동일 여부를 확인해줌
	@RequestMapping("/checkid")
	public Object checkid(String cid){
		String result = "";
		//id가 데이터베이스에서 null값으로 나왔다면 register에서 새로 등록이 가능한 아이디로 됨!
		CustDTO cust = null;
		//데이터베이스에 연동!
		try {
			cust = cust_service.get(cid);
			if(cust != null) {
				result = "f";
			}else {
				result = "t";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
