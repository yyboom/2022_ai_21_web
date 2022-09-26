package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;
//interface에서 interface를 상속시키기 때문에 extends임
//primary key는 id
//spring component의 repository기능을 하는 interface임
@Repository
//+mybatis에 들어갈 수 있게 하는 관문 역할도함
@Mapper
public interface CartMapper extends MyMapper<Integer, CartDTO>{
//상속받은 것들이 있는 것
	//전체 select를 할 수 있는 것을 만듦 => sql에서 cart에 들어있는 component외에!!
	//내가 user_id를 이용해서 cart안에 있는 것들만이 아닌 다른것들도 들고 올 수 있다!
	public List<CartDTO> cartall(String user_id) throws Exception;
}
