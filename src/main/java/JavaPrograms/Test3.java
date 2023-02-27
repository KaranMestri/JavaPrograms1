package JavaPrograms;

public class Test3 {

	static MultiDivAdd getMultiDivAdd(int a, int b)
	{
		return new MultiDivAdd(a *b, (double)a/b, (a+b));
		
	}
	
	public static void main(String[] args) 
	{
	   MultiDivAdd obj =  getMultiDivAdd(8, 2);
	   
	   System.out.println("Multiplication = " + obj.mul);
	   System.out.println("Divison = " + obj.div);
	   System.out.println("Addition = " + obj.add);
	}
}

class MultiDivAdd{
	
	int mul;
	double div;
	int add;
	
	public MultiDivAdd(int m, double d, int a) 
	{
		mul = m;
		div = d;
		add = a;
	}
}