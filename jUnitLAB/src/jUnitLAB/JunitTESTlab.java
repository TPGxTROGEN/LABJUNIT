package jUnitLAB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTESTlab {

	@Test
	void test() {
		JAVALABFUNCTION junitStrings = new JAVALABFUNCTION();
		String result = junitStrings.addStrings("Be Happy"," Always Love Life");
		assertEquals("Be Happy Always Love Life", result);
	}

}
