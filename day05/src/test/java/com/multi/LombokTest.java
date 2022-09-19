package com.multi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;

@SpringBootTest
class LombokTest {

	@Test
	void contextLoads() {
		System.out.println("Start Test ------------------------------------");
		CustDTO cust = new CustDTO("id","pwd","name");
		System.out.println(cust);
		System.out.println("Finish Test ------------------------------------");
	}

}
