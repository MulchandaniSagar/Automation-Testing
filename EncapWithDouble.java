package java_Projects;

class EncapDouble
{
	private double d1 = 12.29;

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}
}

public class EncapWithDouble {

	public static void main(String[] args) {
		EncapDouble e1 = new EncapDouble();
		e1.setD1(99.99);
		System.out.println("The Upated Double Value is : "+ e1.getD1());

	}

}
