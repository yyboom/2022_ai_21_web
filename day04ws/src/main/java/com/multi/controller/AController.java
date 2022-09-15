package com.multi.controller;

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//maincenter.html에서 html이 아닌 결과값을 보내주기 때문에 controller가 아닌 restcontroller을 넣어줘야함!
@RestController
public class AController {
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
		//이미 아이디가 있는 경우
		if(cid.equals("aaaa") || cid.equals("bbbb") || cid.equals("cccc")) {
			result="f";
			//아이디가 없는 경우
		}else {
			result="t";
		}
		return result;
	}
	
	//실검 데이터를 가지고옴(지금은 sql서버로 연결되어있지 않기 때문에 json에 하나하나 데이터를 넣어준 상태임
	@RequestMapping("/getdata")
	public Object getdata(){
		
		//1~10사이 숫자를 랜덤하게 골라서 넣어줌
		Random r = new Random();
		int i1 = r.nextInt(10)+1;
		//arraylist style
		JSONArray ja = new JSONArray();
		//{'num':1,'title':'오징어게임','updown':'up'}하나임!
		//JSON object는 hashmap style임
		JSONObject jo1 = new JSONObject();
		jo1.put("num",i1);
		jo1.put("title","오징어나라");
		jo1.put("updown","up");
		
		//{'num':2,'title':'태풍','updown':'up'}
		int i2 = r.nextInt(20)+1;
		JSONObject jo2 = new JSONObject();
		jo2.put("num",i2);
		jo2.put("title","태풍");
		jo2.put("updown","up");
		
		//{'num':3,'title':'러시아','updown':'up'}
		int i3 = r.nextInt(15)+1;
		JSONObject jo3 = new JSONObject();
		jo3.put("num",i3);
		jo3.put("title","러시아");
		jo3.put("updown","up");
		
		//{'num':4,'title':'우크라이나','updown':'up'}
		int i4 = r.nextInt(25)+1;
		JSONObject jo4 = new JSONObject();
		jo4.put("num",i4);
		jo4.put("title","우크라이나");
		jo4.put("updown","up");
		
		//{'num':5,'title':'전쟁','updown':'up'}
		int i5 = r.nextInt(5)+1;
		JSONObject jo5 = new JSONObject();
		jo5.put("num",i5);
		jo5.put("title","전쟁");
		jo5.put("updown","up");
		
		ja.add(jo1);
		ja.add(jo2);
		ja.add(jo3);
		ja.add(jo4);
		ja.add(jo5);

		return ja;
	}
}
