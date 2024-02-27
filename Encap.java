package java_Projects;

class EncapParent
{
	private String Username = "sagar.mulchandani@gmail.com";
	
	public String getUsername()
	{
		return Username;
		
	}
	
	public void setUsername()
	{
		this.Username = "7977501506";
	}
	
}

public class Encap
{

	public static void main(String[] args) {
		EncapParent e1 = new EncapParent();
		e1.setUsername();
		System.out.println(e1.getUsername());
		

	}

}
