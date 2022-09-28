package com.multi.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@SpringBootTest
class InsertAdm {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		AdmDTO adm = new AdmDTO("admin04", "pwd04", 3);
		try {
			service.register(adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

