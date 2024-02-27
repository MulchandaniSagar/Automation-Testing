package java_Projects;

public class Assign55 extends Child_Class2
{

	public static void main(String[] args) {
		Assign55 a1 = new Assign55();
		a1.MethodInCC();
		a1.MethodInInt();
		a1.MethodInInt2();

	}

	
	public void MethodInInt() {
		System.out.println("Method in Interface");
		
	}

	
	public void MethodInInt2() {
		System.out.println("Method in Interface 2");
		
	}

	
	void MethodInCC() {
		System.out.println("Method in Child Class");
		
	}

}


abstract class Child_Class2 implements InterfaceOne_11
{
	abstract void MethodInCC();
}

interface InterfaceOne_11 extends InterfaceTwo_22
{
	void MethodInInt();
}

interface InterfaceTwo_22
{
	void MethodInInt2();
}
