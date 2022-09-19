package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.dto.CustDTO;

@SpringBootTest
class GetCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustDTO cust = null;
		try {
			cust = biz.get("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cust);
	}

}
