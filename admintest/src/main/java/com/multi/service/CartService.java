package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CartMapper;
//spring component를 형성
@Service
public class CartService implements MyService<Integer, CartDTO>{
	
	@Autowired
	CartMapper mapper;

	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}
	
	//쓰지 않으니 null로
	@Override
	public List<CartDTO> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<CartDTO> cartall(String user_id) throws Exception {
		return mapper.cartall(user_id);
	}
	
	

}
