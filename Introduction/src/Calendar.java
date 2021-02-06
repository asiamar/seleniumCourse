import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Thread.sleep(6000);
		
		/*
		//System.out.println(driver.findElement(By.xpath("//div[@id='marketDate_2'] //input[@class='custom_date_pic required home-date-input']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(6000L);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  --  to jest to samo co na dole
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(6000L);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.name("custom_date_picker")).isEnabled());
		
		*/
		
		/*System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		
		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
			
		{
			System.out.println("kalendarz jest widoczny");
			Assert.assertTrue(true);
			
		}
		else
		{
			System.out.println("kalendarz nie jest widoczny");
			Assert.assertTrue(false);
			}
			*/
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText().contains("2 Adult"));
		
		
			
		}
	}
		


