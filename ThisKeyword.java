package java_Projects;

public class ThisKeyword extends SuperCalledClass
{
	
	int age;
	int salary;
	String name;
	String Company;
	
	void Employee(int age , String Company , String name , int salary)
	{
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.Company=Company;
		System.out.println("values of variable in method");
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(Company);
		
	}
	
	ThisKeyword()
	{
		System.out.println("I am constructor");
	}
	

	public static void main(String[] args) {
		
		System.out.println("Executing this keyword and Super calling statement together");
		ThisKeyword t1 = new ThisKeyword();
		System.out.println("Default values of Global variable");
		System.out.println(t1.age);
		System.out.println(t1.Company);
		System.out.println(t1.salary);
		System.out.println(t1.name);
		t1.Employee(28,"TCS","Sagar Mulchandani" , 5);
		System.out.println("Updated values of Global variable now after this keyword from Method");
		System.out.println(t1.age);
		System.out.println(t1.Company);
		System.out.println(t1.salary);
		System.out.println(t1.name);
	}

	
}

class SuperCalledClass
{
	 SuperCalledClass()
	{
		System.out.println("I am method from another class");
	}
}
