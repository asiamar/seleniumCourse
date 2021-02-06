import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtochart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		for(int i=0; i<products.size(); i++) //petla wykonuje sie do momentu kiedy wszystkie elementy beda przetworzone bo tak mowi metoda size
		{
			String name = products.get(i).getText(); //definiujemy sobie zmienna, kt�ra jest tekstem z naszego id elementu
			
			if(name.contains("Cucumber"))    //jesli nasza zmienna tekstowa zawiera w sobie wyraz cucumber to 
			{
				//click to Add cart
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click(); //kliknij dla tego i w add to chart
				break;  //dzieki temu petla zatrzyma sie w momencie kiedy warunek bedzie spe�niony
				
			//driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]/following-sibling::div[2]/button")).click();
				
			}
		
}
}
	}

