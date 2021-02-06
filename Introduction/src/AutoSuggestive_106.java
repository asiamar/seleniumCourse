import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_106 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/");
		Thread.sleep(5000);
		driver.findElement(By.name("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).getText());
		
		//JavaSript DOM can extract hidden elements (ajax implementation)
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;"; //poniewa¿ jest to string to dajemy w cudzys³owie, a ten cudzys³ów ze srodka nale¿y w ukosniki dac
	//semikolon na koñcu trzeba zawsze
		
		String text = (String) js.executeScript(script);
	System.out.println(text);
	int i = 0;   //deklarujemy zmienna, aby zatrzymaæ petle, bo iannaczej bedzie w kó³ko dzia³ac
	//BANGALURU INTERNATIONAL AIRPORT
	while(!text.equalsIgnoreCase("BeNGALURU INTERNATION AIRPORT"))
	{
		i++;
		driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		text = (String) js.executeScript(script);
		System.out.println(text);
		if(i>10)
		{
			break;
		}
	}
	
	if (i>10)
	{
		System.out.println("Element not found");
	}
	else
	{
		System.out.println("Element found");
	}
	}

}
