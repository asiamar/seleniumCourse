import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtochart2weggie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		int j = 0; //dodajemy zmienna, bo chcemy zatrzymac petle w kt�ryms momencie
		String warzywa [] = {"Cucumber", "Brocolli", "Beetroot"};
		List al = Arrays.asList(warzywa);
		
		List<WebElement> WszystkieWarzywa = (driver.findElements(By.cssSelector("h4.product-name")));
		for(int i=0; i<WszystkieWarzywa.size(); i++)
		{
			String[] NazwaWarzywa = WszystkieWarzywa.get(i).getText().split("-"); //podsiwetli�o sie bo teraz mamy dwie czesci jedna z indexem left, a druga z indeksem right, dlatego prosz� Ci� o zmiane zmiennej string na zmienna tablicowa
			String SformatowanaNazwaWarzywa = NazwaWarzywa[0].trim(); // teraz nalezy utworzyc nowa zmienna mojej lewej strony
			
			//check whether name you extracted is present in array or not
			//convert array into array list for easy search
						
			
			if(al.contains(SformatowanaNazwaWarzywa))
			{
				
				j++;
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				
				if(j==3)
					break;
			}
		}
		
		
	}

}
