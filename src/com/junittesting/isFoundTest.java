package com.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isFoundTest {

	@Test
	void test() {
		Demo demo = new Demo();
		boolean output = demo.isFound("john");
		assertEquals(false, output);
	}

}
