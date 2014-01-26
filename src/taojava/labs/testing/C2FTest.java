package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class C2FTest {

	@Test
	public void testC2f() {
		assertEquals(0, 0);
	}

	@Test
	public void test2() {
		assertEquals("0 degrees C to F", 32, SampleMethods.c2f(0));
	} // test2()
	
	@Test
	public void test3() {
		assertEquals("100 degrees C to F", 212, SampleMethods.c2f(100));
	} // test2()

}

