package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;

@SpringBootTest
class DeleteCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}