package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//자동적으로 만들어주는 것
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustDTO {
	private String id;
	private String pwd;
	private String name;
}
