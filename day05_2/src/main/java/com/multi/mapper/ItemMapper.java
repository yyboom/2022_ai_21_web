package com.multi.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.multi.dto.ItemDTO;
import com.multi.frame.Mapper;

@Repository("itemmapper")
public class ItemMapper implements Mapper<Integer, ItemDTO> {

	@Override
	public void insert(ItemDTO v) throws Exception {
		System.out.println("Inserted: "+v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		System.out.println("Deleted: "+k);
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		System.out.println("Updated: "+v);
		
	}

	@Override
	public ItemDTO select(Integer k) throws Exception {
		ItemDTO item = new ItemDTO(k, "cake", 10000);
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		ArrayList<ItemDTO> list = new ArrayList<>();
		list.add(new ItemDTO(1,"cake",10000));
		list.add(new ItemDTO(2,"squid",23000));
		list.add(new ItemDTO(3,"grape",15000));
		
		return list;
	}

}
