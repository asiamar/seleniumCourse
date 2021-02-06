

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;


public class AmendmentForFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		//List<WebElement> ramki = driver.findElements(By.tagName("frame"));
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));//-	Jesli mamy ramke wewnatrz ramki to trzeba najpierw do dziecka wejsc a pozniej do kolejnego dziecka, bo webdriver widzi tylko te ramki, które sa pierwsze w kolei, dopiero jak wejdziemy g³ebiej to widzi kolejne
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	}

}
