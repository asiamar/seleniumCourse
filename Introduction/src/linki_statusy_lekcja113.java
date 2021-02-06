import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class linki_statusy_lekcja113 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

SoftAssert a = new SoftAssert();
		
for (WebElement link: links)
{
	String url = link.getAttribute("href");
	
	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection(); //openconnection - metoda, ktora zwraca nam status api, jest to metoda obiektu klasy URL
	// jesli nie wiesz jaka to jest zmienna, to przy metodzie jest napisane. konwertujemy do httpurl connection
	
	conn.setRequestMethod("HEAD");
	conn.connect();
	int respCode = conn.getResponseCode();
	System.out.println(respCode);
	

	/*	
 if(respCode>400)
	{
		
		System.out.println("Link o nazwie "+ link.getText()+ " wywali³ siê ze statusem "+ respCode );
		Assert.assertTrue(false);  // to jest dobry kod, ale zakañcz siê po pierwszym zepsutym linku - twarda aserca, a my chcemy miekka
	}
	*/

	/*to co jest na górze mo¿emy zastapic poprzez
	Assert.assertTrue(respCode<400, "Link o nazwie "+ link.getText()+ " wywali³ siê ze statusem "+ respCode);
	test sie wywali, kiedy w asercji true w srodku bedzie false i tego oczekujemy, ze szukamy respons codów >400 
	*/
	
	//teraz poniewa¿ chcemy mieæ soft asercje, czyli taka która sprawdza dla wszystkich przypadków, to wystarczy uzyc obiektu
	
	a.assertTrue(respCode<400, "Link o nazwie "+ link.getText()+ " wywali³ siê ze statusem "+ respCode);
	
	
}


		
		a.assertAll(); //jesli tego nie zapiszemy to nie bedzie zaraportowane, nie moze byc w srodku for petli
		
		
	}

}
