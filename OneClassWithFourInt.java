package java_Projects;

public class OneClassWithFourInt implements Interface10,Inter121,Interface122,Interface13
{

	public static void main(String[] args) {
		OneClassWithFourInt o1 = new OneClassWithFourInt();
		o1.Country();
		o1.State();
		o1.City();
		o1.Pincode();

	}

	
	public void Pincode() {
		System.out.println("Pincode : 421001");
		
	}

	public void City() {
		System.out.println("City : Ulhasnagar");
		
	}

	
	public void State() {
		System.out.println("State : Maharashtra");
		
	}

	
	public void Country() {
	System.out.println("County : India");
	}

}

interface Interface10
{
	void Country();
}

interface Inter121
{
	void State();
}

interface Interface122
{
	void City();
}

interface Interface13
{
	void Pincode();
}