package course1.Abstract;

public abstract class Human {

	public abstract void walk();
	
	public void speak()
	{
		System.out.println("Hey, I am from Human!!");
	}
}

// If you have at least one abstract method then the class should be abstract