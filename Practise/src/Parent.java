
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//te s³owa na fioletowo to s¹ s³owa kluczowe dla javy i nie mo¿esz ich u¿ywac w swoim projekcie
		//wszystko sie zaczyna od metody main i wszystko sie dzieje w metodzie main, czyli kod nie bedzie wywo³ywany jeœli znajdzie sie poza metoda main
		//natomiast do klasy nale¿y wszystko co jest w naszym programie
		// zawsze na koñcu trzeba dac œrednik - semicolon (semikolon)
		
		System.out.println("I started Java learning"); //jesli chcesz cos wyswietlic, this step prints in the output; to co jest pomiêdzy cudzys³owem (double quotes - dabl k³outs) to argument (argiument)
		// add 2 numbers 2,3  5
		// deklarowanie zmiennej o typie integer (zmienna - variable, intid¿er)
		int a=2;
		int b=3;
		int Sum=a+b;
		//System.out.println("sum"); -- tak wyswietli Ci sie teskt, trzeba bez cudzys³owa
		System.out.println(Sum);
		System.out.println("Sum is "+Sum);
		
		//Zadanie: Wyœwietl 5 stron i sprawdz, czy na ka¿dej stronie naglówek jest dobrze wyswietlany
		
		
		System.out.println("I navigated to home page");
		//aby powiedziec lasie parent o istnieniu klasy methods, nalezy zdefiniowac obiekt klasy methods
		Methods m=new Methods(); //czyli zdefiniowalismy sobie obiekt m, 
		//Classobject.methodname -- aby wywo³ac jakakolwiek metode nalezy to wpisac, czyli podazajac za tym piszemy
		System.out.println(m.ValidateHeader());
		
		
		
		
	}

}
