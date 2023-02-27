package course1.Inheritance;

public class TempHuman {
	public static void letsWalk(Human h)
	{
		h.walk();
	}
	
    public static void main(String[] args) {
		
    	Artists a = new Artists();
    	a.name= "Lucia";
    	
    	Musician b = new Musician();
    	b.name = "Jax";
    	
    	letsWalk(a);
    	letsWalk(b);
	}
}
