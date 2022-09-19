package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustBiz;

@SpringBootTest
class GetAllCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		list = biz.get();
		
		for(CustDTO c:list) {
			System.out.println(c);
		}
		
	}

}
