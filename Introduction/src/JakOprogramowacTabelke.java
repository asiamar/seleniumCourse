import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JakOprogramowacTabelke {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30365/kkr-vs-srh-8th-match-indian-premier-league-2020");
		Thread.sleep(8000L);
		WebElement tablica = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		if(driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr'] [class='cb-col cb-col-100 cb-scrd-hdr-rw']")).getText().contains("Sunrisers Hyderabad Innings"))
		{
			int liczbaWierszy = tablica.findElements(By.className("cb-col cb-col-100 cb-scrd-itms")).size();
			System.out.println(liczbaWierszy);
			List <WebElement> listaWartosciWTrzeciejKolumnie = tablica.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
			int liczbaWartosciW3Kolumnie = listaWartosciWTrzeciejKolumnie.size();
			
			//for(int i=0;i<liczbaWartosciW3Kolumnie;i++)
			//{
			//	System.out.println(listaWartosciWTrzeciejKolumnie.get(i).getText());
			//}
		int sum = 0;
			for(int i=0;i<liczbaWartosciW3Kolumnie-2;i++)
			{
				String wartosc = listaWartosciWTrzeciejKolumnie.get(i).getText();
				int valueintiger = Integer.parseInt(wartosc);
				sum = sum+valueintiger;
			}
			System.out.println(sum);
			String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
			int extrasValue = Integer.parseInt(extras);
			int sumanasza = sum+extrasValue;
			System.out.println(sumanasza);
			System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
			String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int totalValue  = Integer.parseInt(total);
			
			if(totalValue==sumanasza)
			{
				System.out.println("Wartosci si� zgadzaj�");
			}
			
			
		}
		

				
				
	}

}