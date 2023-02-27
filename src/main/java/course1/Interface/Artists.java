package course1.Interface;

public class Artists implements Human
{

	public void walk() {
		System.out.println("This is how Artists will walk");
		
	}

	public void speak() {
		System.out.println("This is how Artists will speak");
		
	}

	
	public void preparePainting()
	{
		System.out.println("This is preparing for painting");
	}
   
	public static void main(String[] args) {
		
		Artists a = new Artists();
		
//		Human a = new Artists();
		
		a.preparePainting();
		a.speak();
	}
}
