package com.multi.frame;

import java.util.List;

public interface MyService<K,V> {
	//generic,의미적으론 함수의 기능들이 mapper과 같음
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
}
