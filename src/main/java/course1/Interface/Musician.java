package course1.Interface;

public class Musician implements Human{

	Keyboard myKeyboard = new Keyboard();
	
	public void playKeyboard()
	{
		System.out.println("Musician is playing keyboard now");
	}
	
	public void walk() {
		System.out.println("This is how musician will walk");
		
	}

	public void speak() {
		System.out.println("This is how musician will speak");
		
	}
	
	public static void main(String[] args) {
		Musician a = new Musician();
		
		a.speak();
		
		a.myKeyboard.playSound();
	}

}
