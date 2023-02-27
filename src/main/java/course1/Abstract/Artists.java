package course1.Abstract;

public class Artists extends Human {

	@Override
	public void walk() {
		System.out.println("This is from Artists");
		
	}
	
	public static void main(String[] args) {
		Artists a = new Artists();
		a.walk();
		a.speak();
	}

	
}
