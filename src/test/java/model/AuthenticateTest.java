package model;

import static org.junit.Assert.*;
import model.*;

import org.junit.*;

public class AuthenticateTest {
	String un;
	String pw;
	model.Authenticate au;
	
	@Before
	public void setUp() {
		un = "admin";
		pw = "admin";
		au = new Authenticate();
	}
	
	@Test
	public void loginCheck() {
		boolean valid = au.auth(un, pw);
		System.out.println("running rjmy testsllllllllllllllllll..........");
		assertTrue(valid);
	}
	
	@After
	public void tearDown() {
		au = null;
	}
}
