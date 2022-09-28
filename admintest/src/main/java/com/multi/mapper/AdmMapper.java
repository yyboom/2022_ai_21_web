package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.AdmDTO;
import com.multi.frame.MyMapper;
//interface에서 interface를 상속시키기 때문에 extends임
//primary key는 id
//spring component의 repository기능을 하는 interface임
@Repository
//+mybatis에 들어갈 수 있게 하는 관문 역할도함
@Mapper
public interface AdmMapper extends MyMapper<String, AdmDTO>{
	
}
