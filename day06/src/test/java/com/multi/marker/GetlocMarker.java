package com.multi.marker;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.MarkerDTO;
import com.multi.service.MarkerService;

@SpringBootTest
class GetlocMarker {

	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		List<MarkerDTO> list = null;
		try {
			list = service.getloc("s");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(MarkerDTO c:list) {
			System.out.println(c);
		}
		
	}

}




