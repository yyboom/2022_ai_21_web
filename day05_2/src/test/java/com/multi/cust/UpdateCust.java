package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.dto.CustDTO;

@SpringBootTest
class UpdateCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO("id88", "pwd99", "kim");
		try {
			biz.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

