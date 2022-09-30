package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.mapper.AJAXMapper;


@RestController
public class AJAXController {
	
	@Autowired
	AJAXMapper mapper;
	
	@RequestMapping("/custcnt")
	public String custcnt() {
		int cnt = 0;
		cnt = mapper.getCustCnt();
		return cnt+"";
	}
	
}
