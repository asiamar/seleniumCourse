
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//te s�owa na fioletowo to s� s�owa kluczowe dla javy i nie mo�esz ich u�ywac w swoim projekcie
		//wszystko sie zaczyna od metody main i wszystko sie dzieje w metodzie main, czyli kod nie bedzie wywo�ywany je�li znajdzie sie poza metoda main
		//natomiast do klasy nale�y wszystko co jest w naszym programie
		// zawsze na ko�cu trzeba dac �rednik - semicolon (semikolon)
		
		System.out.println("I started Java learning"); //jesli chcesz cos wyswietlic, this step prints in the output; to co jest pomi�dzy cudzys�owem (double quotes - dabl k�outs) to argument (argiument)
		// add 2 numbers 2,3  5
		// deklarowanie zmiennej o typie integer (zmienna - variable, intid�er)
		int a=2;
		int b=3;
		int Sum=a+b;
		//System.out.println("sum"); -- tak wyswietli Ci sie teskt, trzeba bez cudzys�owa
		System.out.println(Sum);
		System.out.println("Sum is "+Sum);
		
		//Zadanie: Wy�wietl 5 stron i sprawdz, czy na ka�dej stronie nagl�wek jest dobrze wyswietlany
		
		
		System.out.println("I navigated to home page");
		//aby powiedziec lasie parent o istnieniu klasy methods, nalezy zdefiniowac obiekt klasy methods
		Methods m=new Methods(); //czyli zdefiniowalismy sobie obiekt m, 
		//Classobject.methodname -- aby wywo�ac jakakolwiek metode nalezy to wpisac, czyli podazajac za tym piszemy
		System.out.println(m.ValidateHeader());
		
		
		
		
	}

}
