package course1.mypackageB;

public class Person extends PersonSuper{
    public String name;
    public int age;
    public String gender;
    
    public Person()
    {
    	System.out.println("Person Default Constructor");
    }
    
    public Person(String name, int age, String gender)
    {
    	this();
    	System.out.println("Person 3 arg Constructor");
    	this.name= name;
    	this.age= age;
    	this.gender= gender;
    }
    
    public void sleep()
    {
    	if(age < 10)
    	{
    		System.out.println(name + " will sleep more than 12 hours in a day ");
    	}
    	else if(age>=10 && age <= 50)
    	{
    		System.out.println(name + " will sleep less than 10 hours in a day");
    	}
    	else
    	{
    		System.out.println(name + " will sleep average 10 hours in a day");
    	}
    }
	
	public static void main(String[] args) {
		

	}

}
