import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String warzywaDoKupienia [] = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		List warzywaDoKupieniaLista = Arrays.asList(warzywaDoKupienia);
		
		List<WebElement> etykiety = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0; i<etykiety.size();i++)
		{
			String[] rozdzielonaEtykieta = etykiety.get(i).getText().split("-");
			String poprawnaEtykieta = rozdzielonaEtykieta[0].trim();
			
			
			if(warzywaDoKupieniaLista.contains(poprawnaEtykieta))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==warzywaDoKupienia.length)
				{
					break;
				}
			}
		}
		
		
		
	}

}
