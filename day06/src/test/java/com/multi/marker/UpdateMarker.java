package com.multi.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.dto.MarkerDTO;
import com.multi.service.CustService;
import com.multi.service.MarkerService;

@SpringBootTest
class UpdateMarker {

	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		MarkerDTO marker = new MarkerDTO(0, "한식집", null, 0, 0, null, null);
		try {
			service.modify(marker);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

