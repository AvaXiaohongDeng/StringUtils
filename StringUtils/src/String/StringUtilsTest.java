package String;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for the W6StringUtils.java file. Will be used to demo Junit testing in SYST 38634
 *	Xiaohong Deng 2021
 */
class StringUtilsTest {

	/**
	 * A test on good input. We expect this test to return the correct number of seconds.
	 *
	 */
	@Test
	void testReverseStringGood() {
		String seconds = StringUtils.reverseString("12:05:05");
		assertTrue("The string were not reversed properly", seconds.equals("50:50:21"));
	}
		

	/**
	 * A method to check that the method will still work properly on boundary input
	 */
	@Test
	void testReverseStringBoundary() {
		String seconds = StringUtils.reverseString("");
		assertTrue("The string was not reversed properly", seconds.equals(""));
	}


}
