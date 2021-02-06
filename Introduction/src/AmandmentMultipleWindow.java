import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmandmentMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		System.out.println("Jestesmy na parencie");
		WebDriverWait w = new WebDriverWait (driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content>div:nth-child(1)>h3:nth-child(1)")));
		System.out.println(driver.findElement(By.cssSelector("#content>div:nth-child(1)>h3:nth-child(1)")).getText());
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> ids = driver.getWindowHandles(); //tworzyly liste okien
		Iterator <String> it=ids.iterator(); //tworzymy liste ziterowanych idków okien, przy czym iterator znajduje sie na samej górze powyzej wszystkimi idkami dlatego, zeby dostac sie do parenta trzeba dac next
		String parentid = it.next(); // musimy przejsc z 0 di 1 idka
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("Po przejsciu do dziecka");
		System.out.println(driver.findElement(By.cssSelector(".example>h3:nth-child(1)")).getText());
		driver.switchTo().window(parentid);
		System.out.println("Jestesmy na parencie znowu");
		System.out.println(driver.findElement(By.cssSelector("#content>div:nth-child(1)>h3:nth-child(1)")).getText());
		
		
		
		
		
		
	}

}
