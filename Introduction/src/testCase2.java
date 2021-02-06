import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create DriverObject for Chrome Browser
		// we will strictly implement methods of webdriver - to jest interface
		// Class name = ChromeDriver
			//invoke .exe file first	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//driver.get("http://google.com"); // hit url on the browser
				//System.out.println(driver.getTitle()); //validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
		System.out.println(driver.getPageSource()); // page source mo¿emy otrzymac poprzez klikniecie prawym przyciskiem i wybranie opcji wyœwietl ód³o strony; niektóre strony nie maja mozliwosci klikniecia prawym przyciskiem myszy wtedy wyswietlamy w ten sposób 
		
		driver.get("http://yahoo.com"); //driver.navigate().to("http://yahoo.com")  -- powinno dzia³ac tak samo, ale w momencie pisania testu nie dzia³a³o
		driver.get("http://google.com");
		driver.navigate().back(); //wraca do strony poprzedniej (klik back)
		driver.navigate().forward(); // idzie do strony nastepnej (klik next)
		//driver.close(); // It closes current browser
		//driver.quit(); // It closes all the browsers opened by selenium script during one test, that only applies to child windows. Quit the driver.
				
		
		
	}

}
