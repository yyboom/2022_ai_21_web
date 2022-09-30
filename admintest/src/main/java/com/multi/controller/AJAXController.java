package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.mapper.AJAXMapper;


@RestController
public class AJAXController {
	
	@Autowired
	AJAXMapper mapper;
	
	//customer count
	@RequestMapping("/custcnt")
	public String custcnt() {
		int cnt = 0;
		cnt = mapper.getCustCnt();
		return cnt+"";
	}
	
	//item count
	@RequestMapping("/cartitemcnt")
	public String cartitemcnt() {
		int cnt = 0;
		cnt = mapper.getCartItemCnt();
		return cnt+"";
	}
	
	//cart count
	@RequestMapping("/cartprice")
	public String cartprice() {
		int cnt = 0;
		cnt = mapper.getCartPrice();
		return cnt+"";
	}
}
