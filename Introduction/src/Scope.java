import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//give me the counts of the links on the page
		// all links have tagname "a"
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//give me the count of the links on the footer section on the page
		//first we need to create new Webelement that will represent our footer section
		WebElement footersection = driver.findElement(By.id("gf-BIG"));  //limmiting webdriver scope
		System.out.println(footersection.findElements(By.tagName("a")).size());
		
		//give me the count of the links inside the footer section in first column
		WebElement collumnsection = footersection.findElement(By.xpath("table/tbody/tr/td[1]/ul"));
		System.out.println(collumnsection.findElements(By.tagName("a")).size());
		
		//click on each link in the column and check if the pages are opening
		
	for (int i=1; i<collumnsection.findElements(By.tagName("a")).size();i++) 
	{
		String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		collumnsection.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab); //nie dzia�a, poniewa� otwiera nam si� link i nie mo�emy znale kolejnego na nowej stronie; 
	Thread.sleep(5000L);
	}
	Set <String> abc = driver.getWindowHandles(); //4
	
	Iterator <String> it=abc.iterator();
	
	while(it.hasNext())
	{
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	}
		
	}

