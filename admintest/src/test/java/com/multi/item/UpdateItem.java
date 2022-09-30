package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class UpdateItem {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		//반드시 변경되어야 하는 아이디 값을 지정해줘야함!
		ItemDTO item = new ItemDTO(105, "bread",6000, "e.jpg", null,null);
		try {
			service.modify(item);
			System.out.println(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

