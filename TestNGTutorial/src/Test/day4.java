package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

	
	@Test(enabled=false)
	public void WebLoginHomeCarLoan()
	{
	//sellenium
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
	//appium
		System.out.println("MobileLoginHomeLoan");
	}
	@Test
	public void APILoginCarLoan()
	{
	//rest api automation
		System.out.println("APILoginCarLoan");
	}
	
	@BeforeTest
	public void JestemPierwszy()
	{
		System.out.println("JestemPierwszy");
	}
	}
	

