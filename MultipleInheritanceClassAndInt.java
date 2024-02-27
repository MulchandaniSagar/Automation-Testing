package java_Projects;

public class MultipleInheritanceClassAndInt implements state,city
{

	public static void main(String[] args) {
		MultipleInheritanceClassAndInt m1 = new MultipleInheritanceClassAndInt();
		m1.StateName();
		m1.Pincode();

	}

	
	public void Pincode() {
		System.out.println("Pincode : 421001");
		
	}

	
	public void StateName() {
		System.out.println("State : Maharashtra");
		
	}

}

interface  state
{
	void StateName();

}

interface city
{
	void Pincode();
}
