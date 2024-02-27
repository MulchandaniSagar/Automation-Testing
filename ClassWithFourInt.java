package java_Projects;

public class ClassWithFourInt implements Int1
{

	public static void main(String[] args) {
		ClassWithFourInt c1 = new ClassWithFourInt();
		c1.one();
		c1.two();
		c1.three();

	}


	public void two() {
		System.out.println("2");
		
	}

	
	public void three() {
		System.out.println("3");
		
	}

	
	public void one() {
		System.out.println("1");
		
	}

}

interface Int1 extends Int2
{
	void one();
	
	
}

interface Int2 extends Int3
{
	void two();
}

interface Int3
{
	void three();
}


