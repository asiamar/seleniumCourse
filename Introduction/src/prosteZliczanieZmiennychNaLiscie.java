import java.util.ArrayList;

import org.testng.annotations.Test;

public class prosteZliczanieZmiennychNaLiscie {

	
	/*@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> names = new ArrayList();
		names.add("Asia");
		names.add("Ewa");
		names.add("Micha�");
		names.add("Mateusz");
		names.add("Anna");
		int a = 0;
		
		int licznaimion = names.size();
				
				for(int i=0; i<licznaimion; i++)
				{
					String actual = names.get(i);
					if(actual.startsWith("A"))
					{
						a++;
					}	
				}
				
				System.out.println(a);	
	}
*/

	@Test
	public void streamFilter()
	{
		ArrayList <String> names = new ArrayList<String>();
		names.add("Asia");
		names.add("Ewa");
		names.add("Micha�");
		names.add("Ala");
		names.add("Anna");
		
		Long imionka = names.stream().filter(a->a.startsWith("A")).count();  //typ danych to Long tutaj
		System.out.println(imionka);
		
		
	}
	
	
	
}
