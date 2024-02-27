package java_Projects;

public class ClassAndInter extends ChildClass
{
	
	public static void main(String[] args) {
		ClassAndInter c1 = new ClassAndInter();
		c1.login();
		c1.AddToCart();
		c1.Pay();
		c1.logout();
		
	}

}

interface Amazon2 
{
	void login();
	void logout();
}

class ChildClass implements Amazon2
{
	void AddToCart()
	{
		System.out.println("Add to Cart");
	}
	
	void Pay()
	{
		System.out.println("Pay");
	}

	
	public void login() {
		System.out.println("Login");
		
	}

	
	public void logout() {
		System.out.println("Logout");
		
	}
}