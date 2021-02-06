import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000L);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		//driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("mum");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("mum");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ada");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ENTER);
		
	}

}
