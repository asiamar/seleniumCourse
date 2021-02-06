import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson_109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();  //takie dajemy na poczatk przy kazdym tescie
driver.manage().deleteAllCookies();  //usuwa wszystkie ciacha


driver.manage().deleteCookieNamed("sessionKey");  //usuwa ciacha sesji
//test - sprawdz, czy po usunieciu ciasteczek po wejsciu na g³ówna strone aplikacji pojawi sie strona logowania
//kroki: zalogowanie do aplikacji, usuniecie ciastek session key, otworzenie strony aplikacji
		
		
	}

}
