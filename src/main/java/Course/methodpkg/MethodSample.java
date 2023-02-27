package Course.methodpkg;

public class MethodSample {
   public static void main(String[] args) 
   {
	 MethodSample obj = new MethodSample();
	 obj.sayHello();
	 
	 MethodSample newText = new MethodSample();
	 newText.sayHello("male");
	 
   }
   
    public void sayHello()
       {
	      System.out.println("Hello");
       }
 
   public void sayHello(String gender)
   {
	   String newText = gender.equalsIgnoreCase("Male") ? "Hello, sir" : "Hello, Madam";
	   System.out.println(newText);
   }
}

/* <modifier><returnType><nameOfMethod>(Parameter List)
 * {
 *   // method body
 * }
 *
 *EXAMPLE: 
 *
 * public void doSmoething(String action)
 * {
 *   // method body - Statements to do something
 * }
*/