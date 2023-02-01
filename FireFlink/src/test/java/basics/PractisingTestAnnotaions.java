package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractisingTestAnnotaions{
	@BeforeSuite
	public void beforesuite() {
		System.out.println(1);
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println(2);
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("hii");
	}
	
	@Test
	public void testmeth() {
		System.out.println("hloo");
	}
	
	@Test
	public void example() {
		System.out.println(3);
	}
	@AfterTest
	public void aftertest() {
		System.out.println("bye");
	}
	@BeforeMethod
	public void beforemethods() {
		System.out.println("Ashu");
	}



}
