import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
		Actions a = new Actions(driver); //tworzymy objekt a i dajemy jako argument driver object i dzieki temu ten driver moze uzywac metod clasy actions
		WebElement move = driver.findElement(By.id("nav-link-accountList")) ;
		
		//Moves to specific element
		a.moveToElement(move).contextClick().build().perform(); //budujemy nasza akcje, I wykonujemy
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).keyUp(Keys.SHIFT).sendKeys("asia").doubleClick().build().perform();
	//driver.quit();
	
		}

}