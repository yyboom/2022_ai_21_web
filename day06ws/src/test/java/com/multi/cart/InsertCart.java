package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(0, "id04", null, 103, null, 0, 3, 0, null, null);
		try {
			service.register(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

