package java_Projects;

class EncapBoolean
{
	private boolean b = true;

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
}

public class EncapWithBoolean {

	public static void main(String[] args) {
		EncapBoolean e1 = new EncapBoolean();
		e1.setB(false);
		System.out.println("The Boolen is Updated with : " + e1.isB());

	}

}
