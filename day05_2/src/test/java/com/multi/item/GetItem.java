package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ItemBiz;
import com.multi.dto.ItemDTO;

@SpringBootTest
class GetItem {

	@Autowired
	ItemBiz biz;
	
	@Test
	void contextLoads() {
		ItemDTO item = null;
		try {
			item = biz.get(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(item);
	}

}
