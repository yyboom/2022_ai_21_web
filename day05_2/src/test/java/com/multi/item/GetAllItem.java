package com.multi.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ItemBiz;
import com.multi.dto.ItemDTO;

@SpringBootTest
class GetAllItem {

	@Autowired
	ItemBiz biz;
	
	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(ItemDTO c:list) {
			System.out.println(c);
		}
		
	}

}




