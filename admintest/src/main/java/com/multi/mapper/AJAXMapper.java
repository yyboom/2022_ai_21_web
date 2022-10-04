package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ChartDTO;

//crud를 하는 것이 아니기에 extend는 필요 없음
@Repository
@Mapper
public interface AJAXMapper {
	//개수를 세려고 하는 것!
	public int getCustCnt();
	public int getCartItemCnt();
	public int getCartPrice();
	
	public List<ChartDTO> chart1();
}
