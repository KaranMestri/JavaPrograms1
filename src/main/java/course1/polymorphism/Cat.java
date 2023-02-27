package course1.polymorphism;

public class Cat extends DomesticAnimal{

	@Override
	public void eat() {
		super.eat();
		System.out.println("I will eat Meat as well");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setMinSpeed("24 km/hr");
		c.eat();
		c.run();
	}

}
