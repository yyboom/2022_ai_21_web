package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.MarkerDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface MarkerMapper extends MyMapper<Integer, MarkerDTO>{
	
	public List<MarkerDTO> getloc(String loc) throws Exception;

}
