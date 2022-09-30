package com.multi.ajax;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.mapper.AJAXMapper;


@SpringBootTest
class CartItemCnt {

	@Autowired
	AJAXMapper mapper;
	
	@Test
	void contextLoads() {
		int cnt=0;
		
		cnt=mapper.getCartItemCnt();
		System.out.println(cnt);
		
	}

}




