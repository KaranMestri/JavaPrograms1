package course1.Inheritance;

public class TempHuman2 {

	public static void main(String[] args) {
		
		Artists a = new Artists();
		Artists b = new Artists();
		
		if(a.equals(b))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}
}
