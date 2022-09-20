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
	private int id;
	private String user_id;
	private int item_id;
	private int cnt;
	private Date rdate;

}
