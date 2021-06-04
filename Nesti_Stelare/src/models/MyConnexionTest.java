package models;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyConnexionTest {

	@Test
	void testCheckUser() {
		MyConnexion test = new MyConnexion();
		assertTrue(test.checkUser("stephane2021"));
		assertFalse(test.checkUser("toto"));
	}
	
	@Test
	void testCheckId() {
		MyConnexion test = new MyConnexion();
		assertTrue(test.checkId("stephane2021", "b71985397688d6f1820685dde534981b"));
		assertFalse(test.checkId("toto", "b71985397688d6f1820685dde534981c"));
	}
}
