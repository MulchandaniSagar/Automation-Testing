package java_Projects;

public class Assign54 extends child11
{

	void method4()
	{
		System.out.println("Method 4");
	}
	
	public static void main(String[] args) {
		Assign54 a1 = new Assign54();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();

	}

}

class child11 extends abstractChild11
{
	void method3()
	{
		System.out.println("Method 3");
	}


	public void method2() {
		System.out.println("method 2");
		
	}

	
	void method1() {
		System.out.println("method 1");
		
	}
	
}

abstract class abstractChild11 implements Interface111 , Interface222
{
	abstract void method1();
}

interface Interface111
{
	void method2();
}

interface Interface222
{
	void method2();
}