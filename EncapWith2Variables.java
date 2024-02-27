package java_Projects;

import java.util.Scanner;

class Encap2Var
{
	private String Username = "Sagar";
	private String Password = "SAGAR@123";
	
	public String getUsername()
	{
		return Username;
	}
	
	public void setUsername(String Username)
	{
		this.Username = Username;
	}
	
	public String  getPassword()
	{
		return Password;
	}
	
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
	
}

public class EncapWith2Variables {

	public static void main(String[] args) {
		Encap2Var e1 = new Encap2Var();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name to Set Username");
		String usr1 = s1.next();
		e1.setUsername(usr1);
		System.out.println("The Username is set to: " + e1.getUsername());
		System.out.println("Enter to Set Password");
		String pwd = s1.next();
		e1.setPassword(pwd);
		System.out.println("The Password is Set to: " + e1.getPassword());
	}

}
