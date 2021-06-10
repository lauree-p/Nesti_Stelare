package models;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import tools.MD5;

class MyConnexionTest {

	@Test
	void testCheckUser() {
		MyConnexion test = new MyConnexion();
		SuperAdmin.addAdmin("testUnitaire1", "testUnitaire");
		SuperAdmin.addAdmin("testUnitaire2", "testUnitaire");
		assertTrue(test.checkUser("testUnitaire1"));
		assertFalse(test.checkUser("toto"));
		SuperAdmin.deleteAdmin("testUnitaire1");
		SuperAdmin.deleteAdmin("testUnitaire2");
	}
	
	@Test
	void testCheckId() {
		MyConnexion test = new MyConnexion();
		SuperAdmin.addAdmin("testUnitaire1", "testUnitaire");
		SuperAdmin.addAdmin("testUnitaire2", "testUnitaire");
		assertTrue(test.checkId("testUnitaire2", MD5.main("testUnitaire")));
		assertFalse(test.checkId("toto", MD5.main("testUnitaire")));
		SuperAdmin.deleteAdmin("testUnitaire1");
		SuperAdmin.deleteAdmin("testUnitaire2");
	}
}
