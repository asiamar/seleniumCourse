import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots_lesson110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmariasik\\work\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //nale¿y przekonwertowaæ obiekt driver do obiektu takescreenshot i metoda getscreenchot
		FileUtils.copyFile(src, new File("C:\\Users\\jmariasik\\Desktop\\screenshots\\screemhot1.png")); //musimy zaimportowaæ pakiet apache.commons.io, któreho nie ma difultowo w eclipse, wiec trzeba pobrac jara
		
	}

}
