package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {

@Test
public void AsiaLubi()
{
	System.out.println("asialubi");
}

@Test (dataProvider = "getData")
public void AsiaLubiFrytki(String username, String password)
{
	System.out.println(username);
	System.out.println(password);
}

@DataProvider
public Object[][] getData()
{
	//1st combination - username i password - good credit history
	//2nd - username password - no credit history
	//3rd - username password - fraudelent credit history
	Object [][] data = new Object [3][2]; //trzeba utworzyc obiekt typu tablica, który bedzie przechowywa³ dane
	//3 wieresze, 2 kolumny, index w tablicy zawsze zaczynamy od 0
	//pierwszy user
	data [0][0]="firstuername";
	data [0][1] = "firstpassword";
	//column in teh row are nothing but values for that particular combination
	//drugi user
	data [1][0]="secondusername";
	data [1][1] = "secondpassword";
	//trzeci user
	data [2][0]="thirdusername";
	data [2][1] = "thirdpassword";
	return data;
}


}

