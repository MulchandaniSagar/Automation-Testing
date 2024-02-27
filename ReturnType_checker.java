package java_Projects;

public class ReturnType_checker {
	
	 int add(int a, int b)
	{
		int sum = a+b;
		return sum;
		
	}
	
	double sub(int a , double d)
	{
		double sub = a-d;
		return sub;
		
	}
	
	float mul(float a , float b)
	{
		float mul = a*b;
		return mul;
		
	}
	
	String yourName(String str)
	{
		String str2 = "Sagar";
		return str2;
		
	}
	
	boolean booleanChecker(int  b)
	{
		if(b>10)
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		ReturnType_checker r1 = new ReturnType_checker();
		System.out.println(r1.add(10, 10));
		System.out.println(r1.sub(100, 90.9));
		System.out.println(r1.mul(10.90f, 9.9f));
		System.out.println(r1.yourName("Sagar"));
		System.out.println(r1.booleanChecker(9));	

	}

}
