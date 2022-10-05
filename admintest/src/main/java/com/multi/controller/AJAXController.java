package com.multi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.ChartDTO;
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
		List<ChartDTO> list =null;
		JSONObject result = new JSONObject();
		
		JSONArray month_ja = new JSONArray();
		
		JSONArray ja = new JSONArray();
		JSONObject mobj = new JSONObject();
		JSONObject fobj = new JSONObject();
		
		mobj.put("name", "Male");
		fobj.put("name", "Female");
		
		int m =0;
		
		list=mapper.chart1();
		//database연결 전 가상으로 넣어본 것
		JSONArray mja = new JSONArray();
		JSONArray fja = new JSONArray();
		for(ChartDTO c:list) {
			if(c.getGender().equals("M")) {
				mja.add(c.getPrice());
				
			}else{
				fja.add(c.getPrice());
				//해당 month까지 추가함
				m++;
				month_ja.add(m);
			}
		}
		
		mobj.put("data", mja);
		fobj.put("data", fja);
		
		ja.add(mobj);
		ja.add(fobj);
		//현재상태 [{},{}]
		
		//{"month":[1,2,3,4,5,6], "result":[{},{}]}이런식으로 바꿔주면 month도 같이 넣어줄 수 있음!
		result.put("month", month_ja);
		result.put("result", ja);
		
		return result;
	}
	
	//chart2
	@RequestMapping("/chart2")
	public Object chart2(String ssm, String eem) {
		HashMap<String , Object> map = new HashMap<String, Object>();
		map.put("sm", ssm);
		map.put("em", eem);
		List<ChartDTO> list = null;
		list=mapper.chart2(map);
		
		//[{name:'',y:''},{}]
		JSONArray ja = new JSONArray();
		
		for(ChartDTO c: list) {
			JSONObject jo = new JSONObject();
			jo.put("name", c.getGender());
			jo.put("y", c.getTotal_price());
			ja.add(jo);
		}

		return ja;
	}
}
