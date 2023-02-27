package JavaPrograms;

public class Test5 {
    public static void main(String[] args) {
		
    	Student2[] myStudents = new Student2[]
    			{
    				new Student2("Dharma"),
    				new Student2("sanvi"),
    				new Student2("Rupa"),
    				new Student2("Ajay")
    			};	
    				for(Student2 obj : myStudents)
    				{
    					System.out.println(obj);
    				}
    			
	}
}

class Student2
{
	public String name; 
	
	Student2(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}