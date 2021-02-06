package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	
	@Test
	public void MobileaLoginCarLoan()
	{
	//sellenium
		System.out.println("MobileaLoginCarLoan");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
	//appium
		System.out.println("MobileLoginCarLoan");
	}
	@Test (groups= {"Smoke"})
	public void APILoginCarLoan()
	{
	//rest api automation
		System.out.println("APILoginCarLoan");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@BeforeTest
	public void JestemPierwszy()
	{
		System.out.println("JestemPierwszy");
	}
}
