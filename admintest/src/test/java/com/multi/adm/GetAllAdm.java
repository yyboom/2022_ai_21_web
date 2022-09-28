package com.multi.adm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AdmDTO;
import com.multi.service.AdmService;


@SpringBootTest
class GetAllAdm {

	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		List<AdmDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(AdmDTO c:list) {
			System.out.println(c);
		}
		
	}

}




