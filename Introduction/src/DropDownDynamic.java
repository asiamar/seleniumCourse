import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Thread.sleep(6000L);
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//     //a[@value='BLR']
		//    (//a[@value='MAA'])[2]
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(6000L);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); -- nie trzeba bo od razu sie otwiera, po wybraniu from
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] 
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

}
