package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ItemBiz;
import com.multi.dto.ItemDTO;

@SpringBootTest
class UpdateItem {

	@Autowired
	ItemBiz biz;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(4, "bread", 5000);
		try {
			biz.modify(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

