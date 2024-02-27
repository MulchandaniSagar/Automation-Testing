package java_Projects;

class EncapInt
{
	private int id = 987;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

public class EncapWithInt {

	public static void main(String[] args) {
		EncapInt e1 = new EncapInt();
		e1.setId(16);
		System.out.println("The updated ID is : "+e1.getId());

	}

}
