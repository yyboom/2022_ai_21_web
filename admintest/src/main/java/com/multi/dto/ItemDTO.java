package com.multi.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
	
	//img파일들은 이리로 들어와서 서버로 전송이 됨.
	//파일들이 여기에 저장이 되어서 서버로 전송!!
	//여러개를 같이 올릴 때!
	private MultipartFile img;
	//즉 서버로 전송이 될때는 name, price, img의 객체에 담겨서 전송될 것!
}
