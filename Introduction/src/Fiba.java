import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fiba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://10.10.115.106/FIBA");
		//Thread.sleep(2000);
		//driver.findElement(By.name("UserName")).sendKeys("EwaTest");
		//driver.findElement(By.name("Password")).sendKeys("password");
		//driver.findElement(By.xpath("//button[contains(text(),'LOG IN')]")).click();
		
		driver.get("http://10.10.115.106/FIBA/testingpages/main.aspx");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.findElement(By.name("btnFormalisation")).click();
		driver.switchTo().frame(driver.findElement(By.id("iframe")));
		driver.findElement(By.name("tbCustomerForename")).sendKeys("asia");
	}

}
