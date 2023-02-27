package Course.variablepkg;

public class ArrayTest {
       public static void main(String[] args) {
		
    	   int[] myArray = new int[3];
    	   myArray[0] = 4;
    	   myArray[1]= 7;
    	   myArray[2] = 10;
    	   
    	   System.out.println("Value at index 0: " + myArray[0]);
    	   System.out.println("Value at index 1: " + myArray[1]);
    	   System.out.println("Value at index 2: " + myArray[2]);
    	   
    	   System.out.println(" ");
    	   System.out.println("Length of this array is: "+ myArray.length);
    	   
    	   System.out.println(" ");
    	   System.out.println("It will print all the value one by one");
    	   
    	   for(int elements: myArray)
    	   {
    		   System.out.println(elements);
    	   }
    	   
    	   System.out.println("");
    	   
    	   int[] myArray1 = {2,4,6,1,3};
    	   
    	   for(int elements: myArray1)
    	   {
    		   System.out.println(elements);
    	   }
    	   
    	   System.out.println("");
    	   
    	   int[] myArray2 = {1,2,3,4,5};
    	   
    	   for(int elements: myArray2)
    	   {
    		   System.out.println(elements);
    	   }
    	   
    	   System.out.println("");
    	   System.out.println("It will print one by one");
    	   
    	   int[] myArray3 = {10,20,30,40,50};
    	   
    	   for(int elements: myArray3)
    	   {
    		   System.out.println(elements);
    	   }
	}
}
