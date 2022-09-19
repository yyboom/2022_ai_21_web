package com.multi.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.multi.dto.CustDTO;

@Repository
public class CustMapper {
	public void insert(CustDTO cust) {
		System.out.println("Inserted: "+cust);
	}
	public void update(CustDTO cust) {
		System.out.println("Updated: "+cust);
	}
	public void delete(String id) {
		System.out.println("Deleted: "+id);
	}
	public CustDTO select(String id) {
		CustDTO cust = new CustDTO("id01", "pwd01", "james");
		return cust;
	}
	public List<CustDTO> select(){
		ArrayList<CustDTO> list = new ArrayList<>();
		list.add(new CustDTO("id01","pwd01","james"));
		list.add(new CustDTO("id02","pwd02","james"));
		list.add(new CustDTO("id03","pwd03","james"));
		
		return list;
	}
}





