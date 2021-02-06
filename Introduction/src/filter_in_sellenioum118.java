import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter_in_sellenioum118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//przypadek1
		//sprawdzanie czy po kliknieciu na sortowanie, dane sa posortowane
		//click on column
		//capture all webelements into list (original list)
		//sort on the original in the list of step above ->sorted list
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List <WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List <String> originalList =  elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List <String> listaposortowana = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(listaposortowana.equals(originalList));
		
		//przypadek2
		//chcemy zwr�ci� cene fasoli, trzeba zrobi� liste warzyw z kolumny pierwszej i wyfiltrowac po s�owie Rice, a nastepnie nowa metoda dostac sie do ceny
		
		List <String> price;  //musimy zddeklarowac powyzej, poniewaz while (price-by�o wenatrz)
		do
		{
			List <WebElement> rows = driver.findElements(By.xpath("//tr/td[1]")); //musimy powt�rzyc, bo po kliknieciu lista sie zmienia
price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
{
		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
	}
		}while(price.size()<1);
		
	
	}
	private static String getVeggiePrice (WebElement s) { //trzeba utworzyc metode, kt�rej uzywamy powyzej, w metodzie przekazujemy argumenty
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
	


}
	

