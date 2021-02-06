import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class whileForClicking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Thread.sleep(6000L);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		/*int i = 1;
		while (i<6)		
		{
		driver.findElement(By.xpath("//div[@class='_9a071_2tnYy _9a071_3I3EK _9a071_gW37L']")).click();
		i++;
		}
		
		*/
		
	}

}
