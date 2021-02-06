import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZaznaczanieKalendarza {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000L);
		driver.findElement(By.id("ez-accept-all")).click();
		Thread.sleep(8000L);
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		Thread.sleep(8000L);
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();;
		}
		
	
		
		
		List <WebElement> dni = driver.findElements(By.cssSelector(".day"));
		
	System.out.println(dni.size());
	
	int liczbaDni = dni.size();
		
	for(int i=0; i<liczbaDni; i++) {
		String numerDnia = driver.findElements(By.cssSelector(".day")).get(i).getText();
		if(
				numerDnia.equalsIgnoreCase("18")
		
				)
			driver.findElements(By.cssSelector(".day")).get(i).click();
		break;
		
	}
		
	}

}
