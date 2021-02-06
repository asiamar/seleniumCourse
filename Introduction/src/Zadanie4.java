import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadanie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.get("http://10.10.115.105/FIBA/Main/Welcome");
		driver.get("http://10.10.115.105/FIBA/testingpages/main.aspx");
		driver.findElement(By.name("btnFormalisation")).click();
		driver.findElement(By.xpath("//input[@id='tbAssetRegistrationNumber']")).sendKeys("asia");
		driver.findElement(By.name("btFormalizeAgreementCS")).click();
		//String formalizacja = driver.findElement(By.name("tbResult")).getAttribute("value");
		if(driver.findElement(By.name("tbResult")).getAttribute("value").contains("Agreement formalised successfully"))
		{
			driver.findElement(By.id("hlAgreementDetails")).click();
		}
		else 
		{
			System.out.println("Formalizacja nie powiod³a siê");
			Assert.assertTrue(false);
		}
	}

}
