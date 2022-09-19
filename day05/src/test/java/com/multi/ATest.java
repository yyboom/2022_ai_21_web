package com.multi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.test.A;

@SpringBootTest
class ATest {

	@Test
	void contextLoads() {
		A a = new A();
		a.register();
	}

}
