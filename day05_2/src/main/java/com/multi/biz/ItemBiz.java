package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ItemDTO;
import com.multi.frame.Biz;
import com.multi.mapper.ItemMapper;
@Service
public class ItemBiz implements Biz<Integer, ItemDTO>{
	
	/*
	 * //자동적으로 autowired되면서 객체를 생성시켜줌
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("custmapper") Mapper<String, CustDTO> mapper;
	 */
	@Autowired
	ItemMapper mapper;
	
	@Override
	public void register(ItemDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(ItemDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public ItemDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ItemDTO> get() throws Exception {
		return mapper.select();
	}

}
