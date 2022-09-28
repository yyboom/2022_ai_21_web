package com.multi.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;

@SpringBootTest
class UpdateAdm {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		AdmDTO adm = new AdmDTO("admin04", "pwd04", 2);
		try {
			service.modify(adm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

