package java_Projects;

public class FourInterfaces implements Interface11,Interface211,Interface3,Interface4
{

	public static void main(String[] args) {
		FourInterfaces f1 = new FourInterfaces();
		f1.InterfaceMethod1();
		f1.InterfaceMethod2();
		f1.InterfaceMethod3();
		f1.InterfaceMethod4();

	}

	
	public void InterfaceMethod4() {
		System.out.println("Method 4");
		
	}

	
	public void InterfaceMethod3() {
		System.out.println("Method 3");
		
	}

	
	public void InterfaceMethod2() {
		System.out.println("Method 2");
		
	}

	
	public void InterfaceMethod1() {
		System.out.println("Method 1");
		
	}

}

interface Interface11
{
	void InterfaceMethod1();
}

interface Interface211
{
	void InterfaceMethod2();
}
interface Interface3
{
	void InterfaceMethod3();
}

interface Interface4
{
	void InterfaceMethod4();
}
