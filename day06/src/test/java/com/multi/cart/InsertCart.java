package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class InsertCart {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO("id88", "pwd88", "james");
		try {
			service.register(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

