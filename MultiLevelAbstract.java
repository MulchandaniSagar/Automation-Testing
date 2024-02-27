package java_Projects;

public class MultiLevelAbstract extends Abstract1
{

	public static void main(String[] args) 
	{
		MultiLevelAbstract m1 = new MultiLevelAbstract();
		m1.login();
		m1.OTP();
		m1.logout();

	}

	
	void logout() {
		System.out.println("I am Logout");
		
	}

	
	void login() {
		System.out.println("I am Login");
		
	}


	void OTP() {
		System.out.println("I am OTP");
		
	}

}

abstract class Abstract1 extends Abstract2
{
	abstract void logout();
}

abstract class Abstract2
{
	abstract void login();
	abstract void OTP();
	
	
}
