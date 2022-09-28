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
 
public class ItemDTO {
	private int id;
	private String name;
	private int price;
	private String imgname;
	private Date rdate;
}
