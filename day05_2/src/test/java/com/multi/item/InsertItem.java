package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ItemBiz;
import com.multi.dto.ItemDTO;

@SpringBootTest
class InsertItem {

	@Autowired
	ItemBiz biz;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(4, "bread", 3000);
		try {
			biz.register(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

