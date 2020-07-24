package clean.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySampleTest {
	RemoveChars r;
	@BeforeEach
	void setUp()
	{
		r=new ();
	}
	@Test
	void test1char() {
		
		assertEquals("BCD",r.removechars("ABCD"));
		
	}
	@Test
	void test2chars()
	{
	assertEquals("CD",r.removechars("AACD"));
	
		
	}
@Test
void testchar() {
	assertEquals("BCD",r.removechars("BACD"));
	
}
@Test
void testzchar() {
	
	assertEquals("BBAA",r.removechars("BBAA"));
	
}
@Test
void testtchar() {
	assertEquals("BAA",r.removechars("AABAA"));
	
}
}
