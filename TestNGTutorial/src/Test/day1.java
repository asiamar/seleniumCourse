package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {


	
// TODO Auto-generated method stub
	@AfterTest
	public void After()
	{
System.out.println("After");
	}
	
	@Test (dependsOnMethods = {"SecondDemo"})
	public void Demo()
	{
System.out.println("hello");
Assert.assertTrue(false);
	}

	@Test
	public void SecondDemo()
	{
System.out.println("bye");

	}
	@Parameters ({"URL", "URL2"})
	@Test
	public void asia(String asia, String asia2)
	{
System.out.println(asia);
System.out.println(asia2);
	}

	
	
}
