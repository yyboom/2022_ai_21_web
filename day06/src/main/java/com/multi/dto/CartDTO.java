package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 @ToString
 
public class CartDTO {
	 //순서는 상관 없음
	 //sql문으로 뽑을 모든 component들을 넣어줌
	private int id;
	private String user_id;//custid
	private String user_name;//custname
	private int item_id;//itemid
	private String item_name;//itemname
	private int item_price;//itemprice
	private int cnt;
	private int total_price;//join으로 만들어서 넣어주기
	private Date rdate;
	private String item_imgname;

}
