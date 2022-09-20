package com.multi.frame;

import java.util.List;

public interface MyMapper<K,V> {
	//generic
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	//mybatis에서는 위와 같은 함수로 인식하기에 다른 말로 바꿔줘야함.select->selectall
	public List<V> selectall() throws Exception;
}
