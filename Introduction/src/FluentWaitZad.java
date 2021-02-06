import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitZad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		Wait <WebDriver> wait = new FluentWait <WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
				 //Bo FluentWait implementuje Wait interfejs, musimy wpisaæ objekt driver w nawias i obok napisaæ, ¿e o obiekt WebDriver, bo inaczej Fluent Wait nie bedzie wiedzia³, co to za objekt
		//to s¹ argumenty klasy Duration -  dlatego w nawiasie trzeba dac Duration
		

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 if(driver.findElement(By.cssSelector("#finish h4")).isDisplayed())
		    	 {
		       return driver.findElement(By.cssSelector("#finish h4"));
		     }
		    	 else return null; // jesli element nie jest wyswietlony to zwraca nulla, a my okreslilismy w metodzie, ze ma zwrocic WebElement, wic nasz FluentWait widzi, ze cos jest nie tak, wiec czeka kolejne 3 sekundy
		   }});
		   
		   System.out.println(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());
		   System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());
		   
		 
		
	}

}
