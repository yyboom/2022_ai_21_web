package com.multi.ajax;

import java.util.HashMap;
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
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("sm", "2");
		map.put("em", "4");
		List<ChartDTO> list =null;
		list=mapper.chart2(map);
		
		for(ChartDTO c : list) {
			System.out.println(c);
		}
		
	}

}




