package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ItemBiz;

@SpringBootTest
class DeleteItem {

	@Autowired
	ItemBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}