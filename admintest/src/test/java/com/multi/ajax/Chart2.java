package com.multi.ajax;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ChartDTO;
import com.multi.mapper.AJAXMapper;


@SpringBootTest
class Chart2 {

	@Autowired
	AJAXMapper mapper;
	
	@Test
	void contextLoads() {
		List<ChartDTO> list = null;
		
		list=mapper.chart2();
		
		for(ChartDTO c : list) {
			System.out.println(c);
		}
		
	}

}




