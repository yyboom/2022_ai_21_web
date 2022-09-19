package com.multi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.test.SpringA;

@SpringBootTest
class SpringATest {
	@Autowired
	SpringA a;
	@Test
	void contextLoads() {

		a.register();
	}

}
