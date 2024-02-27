package java_Projects;

public class LocalVariables {
	
	static void add()
	{
		int a = 200;
		int b = 200;
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		int a , b ;
		a = 1;
		b = 200;
		int add;
		add = a+b;
		System.out.println(add);
		add();
		System.out.println("Local Variales Executed");
	}

}
