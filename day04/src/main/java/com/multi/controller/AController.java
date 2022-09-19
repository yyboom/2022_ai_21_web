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
	//chart1
	@RequestMapping("/ch1")
	public Object ch1(){
		Random r = new Random();
		JSONArray ja_data = new JSONArray();
		for(var i=1; i<=10; i++) {
			ja_data.add(r.nextInt(30000)+1);
			
		}
		JSONArray ja_cate = new JSONArray();
		//원래 이부분은 database에서 가져오면 됨!
		ja_cate.add("한국");
		ja_cate.add("일본");
		ja_cate.add("중국");
		ja_cate.add("영국");
		ja_cate.add("독일");
		ja_cate.add("프랑스");
		ja_cate.add("미국");
		ja_cate.add("캐나다");
		ja_cate.add("멕시코");
		ja_cate.add("러시아");

		//위의 array들을 가지고 JSONobject를 만들어줌
		JSONObject jo = new JSONObject();
		//cata라는 이름에는 ja_cate를, data라는 이름에는 ja_data를 넣어주는 것
		jo.put("cate", ja_cate);
		jo.put("data", ja_data);
		return jo;
	}
	//chart2-1
	@RequestMapping("/getdata1")
	public Object getdata1(){
		//data의 모양이 배열안에 object가 있고 name, data(다시 []로 되어 있음)라는 atribute가 있는 것 
		//[{name:'',data:[]},{}...]
		Random r = new Random();
		String str = "seoul";
		JSONArray ja = new JSONArray();
		for(var i=1; i<=3; i++) {
			JSONObject jo = new JSONObject();
			jo.put("name", str+i);
			JSONArray jaa = new JSONArray();
			//이중 for문으로 넣어줌!
			for(var k=1; k<=10; k++) {
				jaa.add(r.nextInt(10000)+1);
			}
			jo.put("data", jaa);
			ja.add(jo);
			
			
		}
;		return ja;
	}
	//chart2-2
	@RequestMapping("/getdata2")
	public Object getdata2(){
		//[[],[],[]]배열 안에 배열이 있을 때
		Random r = new Random();
		JSONArray ja = new JSONArray();
		
		String str = "korea";
		
		for(var i=1; i<=20; i++) {
			JSONArray jaa = new JSONArray();
			//data의 모양이 첫번째는 string
			jaa.add(str+i);
			//data의 모양이 두번째는 int임
			jaa.add(r.nextInt(100)+1);
			//만든 배열들을 하나씩 넣어준 것
			ja.add(jaa);
		}
		return ja;
	}
	//chart3
	@RequestMapping("/ch3")
	public Object ch3(String area){
		//{title:'seoul', data :[[],[]]}
		JSONObject jo = new JSONObject();
		if(area.equals("s")){
			//title
			jo.put("title", "Seoul");
			//data
			JSONArray ja = new JSONArray();
			for(var i=1; i<=5; i++) {
				JSONArray jaa = new JSONArray();
				//비율 맞추기
				jaa.add((i*10)+"대");
				jaa.add(20);
				ja.add(jaa);
			}
			
			jo.put("data", ja);
		}else if(area.equals("b")){
			//title
			jo.put("title", "Busan");
			//data
			JSONArray ja = new JSONArray();
			for(var i=1; i<=5; i++) {
				JSONArray jaa = new JSONArray();
				//비율 맞추기
				jaa.add((i*10)+"대");
				jaa.add(20);
				ja.add(jaa);
			}
			
			jo.put("data", ja);
		}else if(area.equals("j")) {
			//title
			jo.put("title", "Jeju");
			//data
			JSONArray ja = new JSONArray();
			for(var i=1; i<=5; i++) {
				JSONArray jaa = new JSONArray();
				//비율 맞추기
				jaa.add((i*10)+"대");
				jaa.add(20);
				ja.add(jaa);
			}
			
			jo.put("data", ja);
		}
		return jo;
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
	
	@RequestMapping("/getmarker")
	public Object getmarker() {
		JSONArray ja = new JSONArray();
		
		JSONObject jo1 = new JSONObject();
		jo1.put("title", "국밥집");
		jo1.put("target", "http://www.naver.com");
		jo1.put("lat", 33.450901);
		jo1.put("lng", 126.570267);
		ja.add(jo1);
		
		JSONObject jo2 = new JSONObject();
		jo2.put("title", "짬뽕집");
		jo2.put("target", "http://www.daum.net");
		jo2.put("lat", 33.460901);
		jo2.put("lng",126.580267);
		ja.add(jo2);
		
		JSONObject jo3 = new JSONObject();
		jo3.put("title", "닭발집");
		jo3.put("target", "http://www.google.com");
		jo3.put("lat", 33.440901);
		jo3.put("lng", 126.573267);
		ja.add(jo3);
		
		return ja;
	}
	@RequestMapping("/getmarker2")
	public Object getmarker2(String loc) {
		JSONArray ja = new JSONArray();
		if(loc.equals("s")) {
			JSONObject jo1 = new JSONObject();
			//database에 저장되어 있는 부분
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 37.5286891);
			jo1.put("lng", 127.061432);
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 37.5386891);
			jo2.put("lng",127.021432);
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 37.5186891);
			jo3.put("lng", 127.031432);
			ja.add(jo3);
		}else if(loc.equals("b")){
			JSONObject jo1 = new JSONObject();
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 35.1223984);
			jo1.put("lng", 129.0896448);
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 35.1113984);
			jo2.put("lng",129.0896998);
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 35.1443984);
			jo3.put("lng", 129.0996448);
			ja.add(jo3);
		}else if(loc.equals("j")) {
			JSONObject jo1 = new JSONObject();
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 33.5199183);
			jo1.put("lng", 126.6142571);
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 33.4610901);
			jo2.put("lng",126.5802671);
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 33.5810901);
			jo3.put("lng", 126.5732671);
			ja.add(jo3);
		}
		
		
		return ja;
	}
}
