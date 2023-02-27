package course1.polymorphism;

public class Cheetah extends WildAnimal{

	public static void main(String[] args) {
		Cheetah c = new Cheetah();
		c.setMinSpeed("80-130 km/hr");
		c.eat();
		c.run();
	}
}
