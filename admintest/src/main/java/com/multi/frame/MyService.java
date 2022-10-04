package com.multi.frame;

import java.util.List;

public interface MyService<K,V> {
	//generic,의미적으론 함수의 기능들이 mapper과 같음
	//transactrion을 걸면 controller에서 어떤 일이 발생했을 때 error이 난다면 뒤로 넘어가지 못할 뿐더러 앞에서 잘된 것들도 
	//실행하기 전으로 돌리는 것!
	//@Transactional
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
}
