package java_Projects;

public class Asign56 implements One_121
{

	public static void main(String[] args) {
		Asign56 a1 = new Asign56();
		a1.method1();
		a1.methid3();
		a1.method2();

	}

	
	public void method2() {
		System.out.println("Method 2");
		
	}


	public void methid3() {
		System.out.println("Method 3");
		
	}

	
	public void method1() {
		System.out.println("Method 1");
		
	}

}

interface One_121 extends Two_121
{
	void method1();
}
interface Two_121 extends Three_121
{
	void method2();
}
interface Three_121
{
	void methid3();
}