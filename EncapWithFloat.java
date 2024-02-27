package java_Projects;

class EncapFloat
{
	private float weight = 99.99f;

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}

public class EncapWithFloat {

	public static void main(String[] args) {
		EncapFloat e1 = new EncapFloat();
		e1.setWeight(100.10f);
		System.out.println("The Updated Weight is : "+e1.getWeight());
		

	}

}
