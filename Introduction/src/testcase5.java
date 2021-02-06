import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@aria-label='Zaloguj siê']")).click();*/
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("email");
		//driver.findElement(By.cssSelector("*[aria-label='Zaloguj siê']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'initiate')]")).click();
	}

}
