package com.multi.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.multi.dto.CustDTO;
import com.multi.frame.Mapper;

@Repository("custmapper")
public class CustMapper implements Mapper<String, CustDTO> {

	@Override
	public void insert(CustDTO v) throws Exception {
		System.out.println("Inserted: "+v);
	}

	@Override
	public void delete(String k) throws Exception {
		System.out.println("Deleted: "+k);
	}

	@Override
	public void update(CustDTO v) throws Exception {
		System.out.println("Updated: "+v);
		
	}

	@Override
	public CustDTO select(String k) throws Exception {
		CustDTO cust = new CustDTO(k, "pwd01", "james");
		return cust;
	}

	@Override
	public List<CustDTO> select() throws Exception {
		ArrayList<CustDTO> list = new ArrayList<>();
		list.add(new CustDTO("id01","pwd01","james"));
		list.add(new CustDTO("id02","pwd02","james"));
		list.add(new CustDTO("id03","pwd03","james"));
		
		return list;
	}

}
