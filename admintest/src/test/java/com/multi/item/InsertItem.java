package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class InsertItem {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		//id는 자동증가이므로 초기화값인 아무것들만 넣어주면됨
		ItemDTO item = new ItemDTO(0, "bread", 3000, "d.jpg", null,null);
		try {
			service.register(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

