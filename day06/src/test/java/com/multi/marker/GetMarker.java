package com.multi.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.MarkerDTO;
import com.multi.service.MarkerService;

@SpringBootTest
class GetMarker {

	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		MarkerDTO marker = null;
		try {
			marker = service.get(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(marker);
	}

}
