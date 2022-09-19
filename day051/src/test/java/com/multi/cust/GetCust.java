package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustBiz;

@SpringBootTest
class GetCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustDTO cust = null;
		cust = biz.get("id01");
		System.out.println(cust);
	}

}
