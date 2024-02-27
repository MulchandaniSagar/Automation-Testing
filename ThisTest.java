package java_Projects;

public class ThisTest {
	
	int a ;
	int b;
	
	void add(int a , int b)
	{
		
		 this.a = a;
		 this.b = 200;
		 
		System.out.println(this.a+this.b);
		
	}

	public static void main(String[] args) {
		
		ThisTest t1 = new ThisTest();
		t1.add(10, 10);
		System.out.println(t1.a);
		System.out.println(t1.b);

	}

}
