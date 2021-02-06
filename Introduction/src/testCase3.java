import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("To mój pierwszy test");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Nie pamiêtasz nazwy konta?")).click();*/

		driver.get("http://google.com");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
		//driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("email");
		driver.findElement(By.cssSelector("a[text()='Gmail']")).click();
		//driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		//input[contains@class,'inputtext')]
		
	}

}
