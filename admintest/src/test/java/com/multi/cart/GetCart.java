package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class GetCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = null;
		try {
			cart = service.get(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cart);
	}

}
