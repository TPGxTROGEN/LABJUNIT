package jUnitLAB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTESTcase {

	@Test
	void test() {
		JAVALABFUNCTION  junit = new JAVALABFUNCTION();
		int result = junit.addNumber(20, 40);
		assertEquals(60, result);
	}

}
