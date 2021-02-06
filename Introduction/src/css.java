import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("email");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
//driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();

		
	}

}
