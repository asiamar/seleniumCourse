import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Pomoc")).click();
		System.out.println(driver.getTitle()); //pomimo tego, ze otwieramy nowe okno to zwraca nam tytu³ dziecka
		
		Set <String> ids = driver.getWindowHandles(); //tworzyly liste okien
		Iterator <String> it=ids.iterator(); //tworzymy liste ziterowanych idków okien, przy czym iterator znajduje sie na samej górze powyzej wszystkimi idkami dlatego, zeby dostac sie do parenta trzeba dac next
		String parentid = it.next(); // musimy przejsc z 0 di 1 idka
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle()); 
	}

}
