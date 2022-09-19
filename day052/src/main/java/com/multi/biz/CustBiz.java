package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CustDTO;
import com.multi.frame.Biz;
import com.multi.mapper.CustMapper;
@Service
public class CustBiz implements Biz<String, CustDTO>{
	
	/*
	 * //자동적으로 autowired되면서 객체를 생성시켜줌
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("custmapper") Mapper<String, CustDTO> mapper;
	 */
	@Autowired
	CustMapper mapper;
	
	@Override
	public void register(CustDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(CustDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public CustDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CustDTO> get() throws Exception {
		return mapper.select();
	}

}
