package Jtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import UserAuthorization.register_limit;


public class AppTest 
{
	private static register_limit register_limit;
		@BeforeClass
		public static void setUp() 
		{
			System.out.println("Setup");
			register_limit = new register_limit();
		}
		
		private register_limit register_limit2;

		@Before
		public void setUpMethod() {
			System.out.println("setup");
			register_limit2 = new register_limit();
		}
		
		@Test
		public void passwordCheckTest() {
			System.out.println("Password Check Test");
			Assert.assertEquals(true, register_limit.passwordCheck("123","123"));		
			Assert.assertEquals(false, register_limit.passwordCheck("123","1233"));		
			Assert.assertEquals(false, register_limit.passwordCheck("",""));			
		}

		@Test
		public void mailValidTest() 
		{
			System.out.println("Mail Valid");
			Assert.assertEquals(true, register_limit.mailValid("test@gmail.com"));	
			Assert.assertEquals(false, register_limit.mailValid("testgmail.com"));		
		}	

		
		@AfterClass
		public static void tearDown() {
			System.out.println("Teardown");
			register_limit = new register_limit();
		}
		
	


		@After
		public void tearDownMethod() {
			System.out.println("teardown");
			register_limit2 = new register_limit();
		}


	
}