package com.multi.ajax;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.mapper.AJAXMapper;


@SpringBootTest
class CartPrice {

	@Autowired
	AJAXMapper mapper;
	
	@Test
	void contextLoads() {
		int cnt=0;
		
		cnt=mapper.getCartPrice();
		System.out.println(cnt);
		
	}

}




