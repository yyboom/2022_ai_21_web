package com.multi.controller;

import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.mapper.AJAXMapper;


@RestController
public class AJAXController {
	
	@Autowired
	AJAXMapper mapper;
	
	//그냥 가져오는 것이기때문에 중간에 service를 넣지는 않음
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
	
	//chart1
	@RequestMapping("/chart1")
	public Object chart1() {
		JSONArray ja = new JSONArray();
		JSONObject mobj = new JSONObject();
		JSONObject fobj = new JSONObject();
		
		mobj.put("name", "Male");
		fobj.put("name", "Female");
		
		//database연결 전 가상으로 넣어본 것
		JSONArray mja = new JSONArray();
		JSONArray fja = new JSONArray();
		for(int i=1;i<=6;i++) {
			Random r = new Random();
			mja.add(r.nextInt(10000)+1);
			fja.add(r.nextInt(10000)+1);
		}
		
		mobj.put("data", mja);
		fobj.put("data", fja);
		
		ja.add(mobj);
		ja.add(fobj);
		return ja;
	}
}
