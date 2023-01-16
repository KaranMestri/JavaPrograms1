package ClassObjSample.ClassObjSample1;

public class ClassObjSample {

	public static void main(String[] args) 
	{
		// <ClassType> objectName = new <ClassName>
		
				Person alex = new Person();
				
				alex.name = "Alex";
				alex.age = 55;
				alex.gender = "Male";
				alex.sleep();
				
				Person jia = new Person();
				
				jia.name = "Jia";
				jia.age = 40;
				jia.gender = "Female";
				jia.sleep(); 
				
				Person james = new Person();
				
				james.name = "James";
				james.age = 9;
				james.gender = "Male";
				james.sleep();

	}

}

class Person
{
	String name;
	int age;
	String gender; 
	
	void sleep()
	{
		if(age<10)
		{
			System.out.println(name + " will sleep more than 12 hours in a day");
		}
		else if(age >= 10 && age <=50)
		{
			System.out.println(name + " will sleep less than 10 hours in a day");
		}
		else
		{
			System.out.println(name + " will sleep average 10 hours in a day");
		}
	}
}