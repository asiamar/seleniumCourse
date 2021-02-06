import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(6000L); //usypiam po kazdym kroku na 6 sekund
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		//System.out.println(s.isMultiple());
		//s.selectByValue("AED");
		//s.selectByIndex(1);
		//s.selectByVisibleText("USD");
		//s.deselectAll();
		//s.deselectAll();
	}

}
