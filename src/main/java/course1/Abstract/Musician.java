package course1.Abstract;

public class Musician extends Human {

	 public void walk()
	 {
		 System.out.println("This is a from Musician");
	 }
	
	 public static void main(String[] args) {
		 
		 Musician a = new Musician();
		 a.walk();
		 a.speak();
		
	}
}
