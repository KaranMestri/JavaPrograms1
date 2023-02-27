package course1.Inheritance;

public class Musician extends Human {
	
	Keyboard myKeyboard = new Keyboard();
	
	public void playKeyboard()
	{
		System.out.println(name + " is playing keybord now");
	}
	
	public void speak()
	{
		System.out.println(name + " will speak calm");
	}
	
	public static void main(String[] args) {
		
		//Human a = new Human();
		
		Musician a = new Musician();
		a.name = "Jax";
		a.age = 51;
		a.gender = "Male";
		
		//a.playKeyboard();
		a.walk();
		a.speak();
		
		a.myKeyboard.playSound();
	}

}
