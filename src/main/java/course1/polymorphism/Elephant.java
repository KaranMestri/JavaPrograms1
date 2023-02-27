package course1.polymorphism;

public class Elephant extends WildAnimal{
    
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("I will eat Fruits as well");
	}
	
	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.setMinSpeed("20 km/hr");
		e.eat();
		e.run();
	}
}
