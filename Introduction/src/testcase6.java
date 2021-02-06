import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		//driver.findElement(By.cssSelector("a[title*='Sign']")).click();
		driver.findElement(By.cssSelector("div#topdiv_0 > h2:nth-child(6) > a:nth-child(1)")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("login");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		//driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		
	}

}
