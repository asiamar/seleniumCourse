import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1Inaczej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> WszystkieEtykiety = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']"));
		for(int i=1; i<WszystkieEtykiety.size();i++)
		{
			String etykieta = WszystkieEtykiety.get(i).getText();
			if(etykieta.contains("Cucumber"))
			{
				buttons.get(i).click();
				break;
			}
					
				
			
		}
		
		
	}

}
