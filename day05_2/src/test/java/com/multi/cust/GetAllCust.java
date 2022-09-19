package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.dto.CustDTO;

@SpringBootTest
class GetAllCust {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CustDTO c:list) {
			System.out.println(c);
		}
		
	}

}




