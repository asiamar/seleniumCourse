import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stream {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
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


//przyk�ad 1
		ArrayList <String> names = new ArrayList<String>();
		names.add("Asia");
		names.add("Ewa");
		names.add("Micha�");
		names.add("Ala");
		names.add("Anna");
		
		
		//there is no life for intermediate op if there is no terminal operation
		//terminal operation will execute only if inter op(filter) returns true - czyli jesli po naszym filtrowaniu nowa lista nie bedzie mia�a zadnych danych to operacja (count) sie nie wykona
		//we can create streamwith stream packet
		//how to use filter with stream API
		long imionka = names.stream().filter(a->a.startsWith("A")).count();  //typ danych to Long tutaj
		System.out.println(imionka);
		
		
		
	//przyk�ad 2
		long d = Stream.of("Asia", "Ewa", "Maicha�", "Mateusz", "Ala", "Anna").filter(b->
		
			b.startsWith("A") //mo�na utworzyc kolekcje w ten spos�b, zamiast arrea jak wczesniej, mo�na tez w taki spos�b kilka operacji wylistowac
			
		).count();
		System.out.println(d);
		//print all the names of ArrayList
		
		
		//przyk�ad 3
		names.stream().filter(s->s
				.length()>3)
		.limit(1) //ograniczamy do jednego
		.forEach(s->System.out.println(s));
		
//przyk�ad 4
		//print names ending with a with uppercase
		Stream.of("Asia", "Ewa", "Maicha�", "Mateusz", "Ala", "Anna").filter(a->a.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	
		//przyk�ad 5
		
	//print names which have first letter as a with uppercase and sorted
	//tutaj albo mo�emy od razu stworzyc sream.of jak powyzej lub jak mamy array to trzeba przekonwertowac do arralist (arrays.aslist)  i zaczac jak w przyk�adzie 1

	List<String>imiona=Arrays.asList("Asia", "Ewa", "Maicha�", "Mateusz", "Ala", "Anna");
	imiona.parallelStream().filter(s->s.startsWith("A")).sorted().map(a->a.toUpperCase()).forEach(s->System.out.println(s));
	
	//przyk�ad 6
	//chcemy po�aczyc dwie listy
	ArrayList <String> names1 = new ArrayList<String>();
	names1.add("Asia");
	names1.add("Ewa");
	names1.add("Micha�");
	names1.add("Ala");
	names1.add("Anna");
	
	List<String>imiona1=Arrays.asList("Asia", "Ewa", "Maicha�", "Mateusz", "Ala", "Anna");
	
	Stream<String> newstream = Stream.concat(names1.stream(), imiona1.stream());
	newstream.sorted().forEach(a->System.out.println(a));
	
	//przyk�ad 7
	//chcemy zobaczyc, czy w liscie mamy dane imie
	
	Stream<String> newstream1 = Stream.concat(names1.stream(), imiona1.stream());
	
	boolean flag = newstream1.anyMatch(s->s.equalsIgnoreCase("asia"));
	//Assert.assertFalse(flag);
	
	//przyk�ad 8
	//jeszcze mamy metode collect, kt�ra zwraca kolekcje i wrzuca do nowej listy po to aby�my mogli dokonywa� r�nych sprawdzen lub modyfikacji
	List<String> ls = Stream.of("Asia", "Ewa", "Maicha�", "Mateusz", "Ala", "Anna").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
	
	System.out.println(ls.get(3));
	
	//przyklad 9
	//jak zwr�ci� unikatowe dane z poni�szej listy
	Stream<Integer> liczby = Stream.of(1,1,3,4,3).distinct();
	liczby.forEach(s->System.out.println(s));
	//lub tak
	List<Integer>liczbenki=Arrays.asList(1,1,3,4,3);
	liczbenki.stream().distinct().forEach(s->System.out.println(s));
	List<Integer>nowa = liczbenki.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(nowa.get(2));
	
	}
	
	
	
	
}
	
	


