package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class GlobalProperties {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream ("C:\\Users\\jmariasik\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
	//FileInputStream clasa bierze dane z plku, który podaliœmy i tworzy dla nas objekt
	prop.load(fis);
			prop.getProperty("browser")	;
			System.out.println(prop.getProperty("browser"))	;
			System.out.println(prop.getProperty("url"))	;
			//mo¿emy tez wprowadzic propertiesy
			prop.setProperty("browser", "firefox");
			System.out.println(prop.getProperty("browser"))	;
		
			FileOutputStream fos = new FileOutputStream ("C:\\Users\\jmariasik\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
	prop.store(fos, null);
			
	}

}
