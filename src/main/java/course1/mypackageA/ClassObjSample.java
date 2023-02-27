package course1.mypackageA;

import course1.mypackageB.Person;

public class ClassObjSample {

	public static void main(String[] args) {
		
		Person alex = new Person("Alex", 23, "Male");
		alex.sleep();
		
		Person jia = new Person();
		jia.name= "Jia";
		jia.age= 40;
		jia.gender="Female";
		jia.sleep();
		
		Person james = new Person();
		james.name = "James";
		james.age = 9;
		james.gender = "Male";
		james.sleep();

	}

}
