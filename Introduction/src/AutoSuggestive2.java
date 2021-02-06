import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("mum");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ada");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ENTER);*/
		
		//to co na górze mo¿na zapisaæ tez w inny sposób - poprzez zdefiniowanie zmiennej, aby nie szukac elementu ca³y czas:
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[2]")); 
		from.sendKeys("mum");
		Thread.sleep(5000);
		from.clear();
		Thread.sleep(5000);
		from.sendKeys("ada");
		Thread.sleep(5000);
		from.sendKeys(Keys.ARROW_DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value"));
		from.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromCity']")).getAttribute("value"));
		//input[@id='fromCity']"
		
		/*
		//driver.findElement(By.xpath("//label[@for='toCity']")).click();
		Thread.sleep(5000);
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[3]")); 
		to.sendKeys("del");
		Thread.sleep(5000);
		to.clear();
		Thread.sleep(5000);
		to.sendKeys("bel");
		Thread.sleep(5000);
		for (int i=1;i<5;i++)
		{
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		}
		
		to.sendKeys(Keys.ENTER);*/
		
				
		
		
	}
}
