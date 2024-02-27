package java_Projects;

public class InterfacePart1 implements Amazon
{

	public static void main(String[] args) {
		InterfacePart1 i1 = new InterfacePart1();
		i1.login();
		i1.logout();

	}


	public void login() {
		System.out.println("I am Login");
		
	}

	public void logout() {
		System.out.println("I am Logout");
	}

}

interface Amazon
{
	void login();
	void logout();
}
