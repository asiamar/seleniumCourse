import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class odrahulaZbieranieLinkow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				//give me the count of the links on the footer section on the page
				//first we need to create new Webelement that will represent our footer section
				WebElement footersection = driver.findElement(By.id("gf-BIG"));  //limmiting webdriver scope
				System.out.println(footersection.findElements(By.tagName("a")).size());
				
				//give me the count of the links inside the footer section in first column
				WebElement collumnsection = footersection.findElement(By.xpath("table/tbody/tr/td[1]/ul"));
				System.out.println(collumnsection.findElements(By.tagName("a")).size());
				
				//click on each link in the column and check if the pages are opening
				String Beforeclicking=null;
				String Afterclicking;
				for(int i=0;i<collumnsection.findElements(By.tagName("a")).size();i++)
				{
				
					
					if(collumnsection.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
					{
						 Beforeclicking = driver.getTitle();
					
						collumnsection.findElements(By.tagName("a")).get(i).click();
						break;
						}
				}
				
			
				 Afterclicking =driver.getTitle();
				if(Beforeclicking!=Afterclicking)
				{
					if(driver.getPageSource().contains("sitemap"))
				
						System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
					
				
		
		
		
		
	}

}
