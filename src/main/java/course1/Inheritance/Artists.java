package course1.Inheritance;

public class Artists extends Human {
	
	public void preparePainting()
	{
		System.out.println(name + " is preparing for painting");
	}
	
	public static void main(String[] args) {
		
		Artists a = new Artists();
		
		
		a.name = "Lucia";
		a.age = 23;
		a.gender = "Female";
		
		a.preparePainting();
		a.walk();
	}

}
