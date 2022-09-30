package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//crud를 하는 것이 아니기에 extend는 필요 없음
@Repository
@Mapper
public interface AJAXMapper {
	//개수를 세려고 하는 것!
	public int getCustCnt();
}
