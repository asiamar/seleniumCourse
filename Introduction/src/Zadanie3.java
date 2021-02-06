import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String warzywaDoKupienia[] = { "Cucumber", "Beetroot", "Brocolli", "Carrot" };
		List warzywaDoKupieniaLista = Arrays.asList(warzywaDoKupienia);
		dodajWarzywa(driver, warzywaDoKupieniaLista, warzywaDoKupienia);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		

	}

	public static void dodajWarzywa(WebDriver driver, List warzywaDoKupieniaLista, String warzywaDoKupienia[]) {
		int j = 0;
		List<WebElement> etykiety = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < etykiety.size(); i++) {
			String rozdzielonaEtykieta[] = driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText()
					.split("-");
			String dobraEtykieta = rozdzielonaEtykieta[0].trim();
			if (warzywaDoKupieniaLista.contains(dobraEtykieta)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == warzywaDoKupienia.length) {
					break;
				}

			}

		}
	}
}
