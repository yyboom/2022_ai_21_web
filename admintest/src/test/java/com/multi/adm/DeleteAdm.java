package com.multi.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.AdmService;

@SpringBootTest
class DeleteAdm {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("admin04");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}