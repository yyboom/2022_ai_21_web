package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CustDTO;
import com.multi.mapper.CustMapper;

@Service
public class CustBiz {
	@Autowired
	CustMapper custmapper;
	
	public void register(CustDTO cust) {
		custmapper.insert(cust);
	}

	public void modify(CustDTO cust) {
		custmapper.update(cust);
	}
	public void remove(String id) {
		custmapper.delete(id);
	}
	public CustDTO get(String id) {
		return custmapper.select(id);
	}
	public List<CustDTO> get(){
		return custmapper.select();
	}
}