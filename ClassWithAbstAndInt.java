package java_Projects;

public class ClassWithAbstAndInt extends AbstractClass11
{

	public static void main(String[] args) {
		ClassWithAbstAndInt c1 = new ClassWithAbstAndInt();
		c1.AbstractMethod1();
		c1.AbstractMethod2();
		c1.AbstractMethod3();

	}

	
	public void AbstractMethod2() {
		System.out.println("I am Abstract 2");
		
	}


	public void AbstractMethod3() {
		System.out.println("I am Abstract 3");
		
	}


	void AbstractMethod1() {
		System.out.println("I am Abstract 1");
		
	}

}

abstract class AbstractClass11 implements Interface31,Interface32
{
	abstract void AbstractMethod1();
}

interface Interface31
{
	void AbstractMethod2();
}

interface Interface32
{
	void AbstractMethod3();
}