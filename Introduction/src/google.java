import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	
		//driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("weganizm");
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/following-sibling::div[2]/center/input/following-sibling::input[1]/preceding-sibling::input[1]")).click();
	
		System.out.println(driver.findElement(By.xpath("//*[text()='Grafika']")).getAttribute("class"));
		
		
		
	}

}
