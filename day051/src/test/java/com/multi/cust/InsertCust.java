package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustBiz;

@SpringBootTest
class InsertCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO("id88", "pwd88", "james");
		biz.register(cust);
	}

}
