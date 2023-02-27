package Course.P1;

import Course.P2.C;

public class B extends C{
   public static void main(String[] args) {
	
	   A a = new A();
	   a.sayHello();
	   
	   B c = new B();
	   c.sayHello();
	   
}
}

class A
{
	public void sayHello()
	{
		System.out.println("Hello from A");
	}
}