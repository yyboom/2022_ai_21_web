package com.multi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//spring controller에서 동작할 수 있도록 annotation을 한 것
@Service
public class SpringA {
	//class들끼리의 연결을 annotation을 통해서 연결한 것!
	//자동적으로 Bclass를 찾아서 넣어주는 것!
	@Autowired
	SpringB b;
	//생성자의 개념이 없음
	//b를 생성 후 실행
	public void register() {
		b.insert();
	}
}
